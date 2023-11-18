package br.ce.wcaquino.servicos;

import static br.ce.wcaquino.builders.FilmeBuilder.umFilme;
import static br.ce.wcaquino.builders.LocacaoBuilder.umLocacao;
import static br.ce.wcaquino.builders.UsuarioBuilder.umUsuario;
import static br.ce.wcaquino.matchers.MatchersProprios.caiNumaSegunda;
import static br.ce.wcaquino.matchers.MatchersProprios.ehHoje;
import static br.ce.wcaquino.matchers.MatchersProprios.ehHojeComDIferencaDeDias;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import br.ce.wcaquino.builders.FilmeBuilder;
import br.ce.wcaquino.builders.UsuarioBuilder;
import br.ce.wcaquino.dao.LocacaoDAO;
import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.exceptions.FilmeSemEstoqueException;
import br.ce.wcaquino.exceptions.LocadoraException;
import br.ce.wcaquino.utils.DataUtils;



public class LocacaoServiceTest {
	@InjectMocks @Spy
	private LocacaoService lS;
	@Mock
	private SPCService spcService;
	@Mock
	private LocacaoDAO locacaoDAO;
	@Mock
	private EmailService emailService;
	
	@Rule
	public ErrorCollector error = new ErrorCollector();
	
	@Rule
	public ExpectedException  exception = ExpectedException.none();
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void deveAlugarUmFilme() throws Exception {
	
		
		Assert.assertFalse(DataUtils.verificarDiaSemana(new Date(), Calendar.SATURDAY));
		Usuario usuario = UsuarioBuilder.umUsuario().agora();
		Filme filme = FilmeBuilder.umFilme().agora();
		
		List<Filme>filmes = new ArrayList<Filme>();
		
		filmes.add(filme);
		
		Mockito.doReturn(DataUtils.obterData(28, 04, 2017)).when(lS).obterData();
		
		//Ação
		Locacao locacao;
		
		locacao = lS.alugarFilme(usuario, filmes);
		
		//Verificação
		error.checkThat(locacao.getValor(),is(10.0));
		error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(),DataUtils.obterData(28,04,2017)),is(true));
		error.checkThat(DataUtils.isMesmaData(locacao.getDataRetorno(),DataUtils.obterData(29,04,2017)),is(true));
		
			
		
	}
	
	//Se espera uma exceção (Elegante) //Quando se espera uma exceção por um único motivo (Filme sem estoque)
	@Test(expected = FilmeSemEstoqueException.class)
	public void naoDeveAlugarFilmeSemEstoque() throws Exception {
		
		
		Usuario usuario = UsuarioBuilder.umUsuario().agora();
		Filme filme = FilmeBuilder.umFilmeSemEstoque().agora();
		
		List<Filme>filmes = new ArrayList<Filme>();
		
		filmes.add(filme);
		
		lS.alugarFilme(usuario, filmes);
			
	
	}
	
	//Robusta  //Trato o erro que desejo e o outro possivel (FilmeSemEStoque jogo pro JUnit) 
	// Mais completa // usada com mensagem //Dá sequencia ao código apos o tratamento
	@Test
	public void NaoDevePermitirUsuario_Vazio() throws FilmeSemEstoqueException{
		
	
		//Usuario usuario = UsuarioBuilder.umUsuario().agora();
		Filme filme = FilmeBuilder.umFilme().agora();
		List<Filme>filmes = new ArrayList<Filme>();
		
		filmes.add(filme);
								
		try {
				lS.alugarFilme(null, filmes);
				Assert.fail();
		}  catch (LocadoraException e) {
					assertThat(e.getMessage(),is("Usuario vazio"));
		}
				
		
	
	}
		
	//Nova // usada com mensagem	
	@Test()
	public void NaoDevePermitir_filmeVazio() throws FilmeSemEstoqueException, LocadoraException {
		
		Usuario usuario = UsuarioBuilder.umUsuario().agora();
		//Filme filme = FilmeBuilder.umFilme().agora();
		
		//Se espera a exceção antes da ação
		exception.expect(LocadoraException.class);
		exception.expectMessage("Filme vazio");
		
		lS.alugarFilme(usuario, null);
		
	}
		

	//Metódo statico usando powerMockito
	@Test	
	public void deveDevolverNaSegundaSeAlugarNoSabado() throws Exception {
		Assert.assertFalse(DataUtils.verificarDiaSemana(new Date(), Calendar.SATURDAY));
		
		//Cenário
		Usuario usuario = UsuarioBuilder.umUsuario().agora();			
		List<Filme> filmes = Arrays.asList(FilmeBuilder.umFilme().agora());
		
		Mockito.doReturn(DataUtils.obterData(29, 04, 2017)).when(lS).obterData();
		
		//Ação
		
		Locacao locacao_resultado = lS.alugarFilme(usuario, filmes);
				
		//Verificação	
				
		assertThat(locacao_resultado.getDataRetorno(), caiNumaSegunda());
					
	}
	
	@Test
	public void naoDeveAlugarFilmeANegativadoSPC() throws Exception {
		//cenário
		Usuario usuario = umUsuario().agora();
		//Usuario usuario2 = umUsuario(). comNome("Usuario2").agora();
		List<Filme> filmes = Arrays.asList(umFilme().agora());
		
		when(spcService.possuiNegativacao(Mockito.any(Usuario.class))).thenReturn(true);
		
		//ação
		try {
			lS.alugarFilme(usuario, filmes);
			Assert.fail();
		} catch (LocadoraException e) {
			assertThat(e.getMessage(),is("Usuario Negativado"));
		}
		
		//verificação
		Mockito.verify(spcService).possuiNegativacao(usuario);
	}
	
	@Test
	public void deveEnviarEmailParaLocacoesAtrasadas() {
		//cenário
		
		Usuario usuario = umUsuario().agora();
		Usuario usuario2 = umUsuario().comNome("Fulano").agora();
		Usuario usuario3 = umUsuario().comNome("Atrasado 2").agora();
		
		List<Locacao> locacaos = Arrays.asList(
				umLocacao().comUsuario(usuario).atrasado().agora(),
				umLocacao().comUsuario(usuario2).agora(),
				umLocacao().atrasado().comUsuario(usuario3).agora(),
				umLocacao().atrasado().comUsuario(usuario3).agora()
				
		);
		when(locacaoDAO.obterLocacoesPendentes()).thenReturn(locacaos);
		
		//ação
		lS.notificarAtrasos();

		//verificação 
		//método mais genérico, o mockito.any pega qualquer usuario
		verify(emailService,Mockito.times(3)).notificarAtraso(Mockito.any(Usuario.class));
		
		verify(emailService).notificarAtraso(usuario);
		verify(emailService,Mockito.atLeastOnce()).notificarAtraso(usuario3);
		verify(emailService, Mockito.never()).notificarAtraso(usuario2);
		Mockito.verifyNoMoreInteractions(emailService);
		
		
	}
	
	@Test
	public void deveTratarErroNoSPC() throws Exception {
		//cenário
		Usuario usuario = umUsuario().agora();
		List<Filme>filmes = Arrays.asList(umFilme().agora());
		
		when(spcService.possuiNegativacao(usuario)).thenThrow(new Exception("Falha!"));
		
		//Verificação
		exception.expect(LocadoraException.class);
		exception.expectMessage("SPC FORA DO AR");
		
		//Ação
		lS.alugarFilme(usuario, filmes);
		
						
	} 

	@Test
	public void deveProrrogarUmaLocacao() {
		//Cenário 
		
		Locacao locacao = umLocacao().agora();
		
		//ação
		
		lS.prorrogarLocacao(locacao, 3);
		
		//verificacao // Pegando a mesma locação do metodo prorrogar locacao usando AgrCaptor
		ArgumentCaptor<Locacao> argumentoCaptor = ArgumentCaptor.forClass(Locacao.class);
		Mockito.verify(locacaoDAO).salvar(argumentoCaptor.capture());
		
		Locacao locacao_retornada = argumentoCaptor.getValue();
		
		error.checkThat(locacao_retornada.getValor(), is(30.0) );
		error.checkThat(locacao_retornada.getDataLocacao(), ehHoje());
		error.checkThat(locacao_retornada.getDataRetorno(), ehHojeComDIferencaDeDias(3));
		
		
			
		
	}
	
	
	@Test
	public void deveCalcularValorLocacao() throws Exception {
		//cenário
		List<Filme>filmes = Arrays.asList(umFilme().agora());
		
		//ação
		Class<LocacaoService> clazz= LocacaoService.class;
		Method metodo = clazz.getDeclaredMethod("calcularValorLocacao", List.class);
		metodo.setAccessible(true);
		Double valor = (Double)metodo.invoke(lS, filmes);
		
			
		
		//verificação
		Assert.assertThat(valor,is(10.0));
		
	}
	
	
	
	
}