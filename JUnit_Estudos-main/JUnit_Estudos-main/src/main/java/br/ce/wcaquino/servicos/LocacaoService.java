package br.ce.wcaquino.servicos;

import static br.ce.wcaquino.utils.DataUtils.adicionarDias;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.ce.wcaquino.dao.LocacaoDAO;
import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.exceptions.FilmeSemEstoqueException;
import br.ce.wcaquino.exceptions.LocadoraException;
import br.ce.wcaquino.utils.DataUtils;


public class LocacaoService {

	private LocacaoDAO locacaoDAO;
	private SPCService spcService;
	private EmailService emailService;
	
	
	
	public Locacao alugarFilme(Usuario usuario, List<Filme> filmes) throws FilmeSemEstoqueException, LocadoraException {

		if (usuario == null) {
			throw new LocadoraException("Usuario vazio");

		}
		if (filmes == null || filmes.isEmpty()) {
			throw new LocadoraException("Filme vazio");

		}

		for (Filme filme2 : filmes) {
			if (filme2.getEstoque() == 0) {
				throw new FilmeSemEstoqueException();
			}

		}
		
		boolean negativado;
		try {
			negativado= spcService.possuiNegativacao(usuario);
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new LocadoraException("SPC FORA DO AR");
		}
		if(negativado) {
			throw new LocadoraException("Usuario Negativado");
		}

		Locacao locacao = new Locacao();
		locacao.setFilmes(filmes);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(obterData());
		locacao.setValor(calcularValorLocacao(filmes));

		// Entrega no dia seguinte
		Date dataEntrega =obterData();
		dataEntrega = adicionarDias(dataEntrega, 1);
		if(DataUtils.verificarDiaSemana(dataEntrega, Calendar.SUNDAY)) {
			dataEntrega = adicionarDias(dataEntrega, 1);
			
		}
		
		
		locacao.setDataRetorno(dataEntrega);

		// Salvando a locacao
		locacaoDAO.salvar(locacao);

		return locacao;
	}

	protected Date obterData() {
		return new Date();
	}

	private double calcularValorLocacao(List<Filme> filmes) {
		double total = 0;

		for (int i = 0; i < filmes.size(); i++) {
			Filme filme = filmes.get(i);
			Double valorFilme = filme.getPrecoLocacao();

			switch (i) {
			case 2:
				valorFilme = valorFilme * 0.75;break;
			case 3:
				valorFilme = valorFilme * 0.50;break;
			case 4:
				valorFilme = valorFilme * 0.25;break;
			case 5:
				valorFilme = valorFilme * 0;break;
			}
			total += valorFilme;

		}
		return total;
	}
	
	public void notificarAtrasos() {
		List<Locacao> locacoes = locacaoDAO.obterLocacoesPendentes();
	
		for(Locacao locacao: locacoes) {
			if(locacao.getDataRetorno().before(obterData())) {
			emailService.notificarAtraso(locacao.getUsuario());
		}}
	}
	
	
	public void prorrogarLocacao(Locacao locacao, int dias) {
		
		Locacao novaLocacao = new Locacao();
		novaLocacao.setUsuario(locacao.getUsuario());
		novaLocacao.setValor(locacao.getValor()*dias);
		novaLocacao.setDataLocacao(obterData());
		novaLocacao.setDataRetorno(DataUtils.obterDataComDiferencaDias(dias));
		novaLocacao.setFilmes(locacao.getFilmes());
		
		locacaoDAO.salvar(novaLocacao);
		
	}
	
	
}