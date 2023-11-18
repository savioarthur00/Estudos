package br.ce.wcaquino.servicos;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.ce.wcaquino.builders.FilmeBuilder;
import br.ce.wcaquino.dao.LocacaoDAO;
import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.exceptions.FilmeSemEstoqueException;
import br.ce.wcaquino.exceptions.LocadoraException;

@RunWith(Parameterized.class)
public class CalcularLocacaoTest {
	
	@Parameter
	public List<Filme>filmes;
	@Parameter(value=1)
	public Double valorLocacao;
	@Parameter(value=2)
	public String valor;
	
	@InjectMocks
	private LocacaoService lS;
	@Mock
	private SPCService spcService;
	@Mock
	private LocacaoDAO locacaoDAO ;
		
	@Before
	public void setup() {
		
		 MockitoAnnotations.initMocks(this);
		 
	}
	
	private static Filme filme =FilmeBuilder.umFilme().agora();
	private static Filme filme2 =FilmeBuilder.umFilme().agora();
	private static Filme filme3 =FilmeBuilder.umFilme().agora();
	private static Filme filme4 =FilmeBuilder.umFilme().agora();
	private static Filme filme5 =FilmeBuilder.umFilme().agora();
	private static Filme filme6 =FilmeBuilder.umFilme().agora();
	
	
	@Parameters(name="{2}")
	public static Collection<Object[]>getParametros(){
		return Arrays.asList(new Object[][] {
		
		{Arrays.asList(filme,filme2,filme3),27.5,"3º Filme 25%"},
		{Arrays.asList(filme,filme2,filme3,filme4),32.5,"4º Filme 50%"},
		{Arrays.asList(filme,filme2,filme3,filme4,filme5),35.0,"5º Filme 75%"},
		{Arrays.asList(filme,filme2,filme3,filme4,filme5,filme6),35.0,"6º Filme 100%"}
			
		});
	}
	
	@Test()
	public void DeveCalcularValorLocacaoConsiderandoDescontos() throws FilmeSemEstoqueException, LocadoraException {
		//cenario 
		Usuario usuario = new Usuario("Usuario 1");				
		
		//ação		
		Locacao resultado = lS.alugarFilme(usuario, filmes);		
		
		//Verificação				
		assertThat(resultado.getValor(),is(valorLocacao));
		
	}

}
