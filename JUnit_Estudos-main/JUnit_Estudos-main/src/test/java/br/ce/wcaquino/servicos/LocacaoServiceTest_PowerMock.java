package br.ce.wcaquino.servicos;

import static br.ce.wcaquino.builders.FilmeBuilder.umFilme;
import static br.ce.wcaquino.builders.UsuarioBuilder.umUsuario;
import static br.ce.wcaquino.matchers.MatchersProprios.caiNumaSegunda;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

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
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareEverythingForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import br.ce.wcaquino.builders.FilmeBuilder;
import br.ce.wcaquino.builders.UsuarioBuilder;
import br.ce.wcaquino.dao.LocacaoDAO;
import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;


@RunWith(PowerMockRunner.class)
@PrepareEverythingForTest
public class LocacaoServiceTest_PowerMock {
	@InjectMocks
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
		lS = PowerMockito.spy(lS);
	}
	
	@Test
	public void deveAlugarUmFilme() throws Exception {
	
		
		Assert.assertFalse(DataUtils.verificarDiaSemana(new Date(), Calendar.SATURDAY));
		Usuario usuario = UsuarioBuilder.umUsuario().agora();
		Filme filme = FilmeBuilder.umFilme().agora();
		
		List<Filme>filmes = new ArrayList<Filme>();
		
		filmes.add(filme);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH,29);
		calendar.set(Calendar.MONTH,Calendar.APRIL);
		calendar.set(Calendar.YEAR,2017);
		PowerMockito.mockStatic(Calendar.class);
		PowerMockito.when(Calendar.getInstance()).thenReturn(calendar);
		
		//Ação
		Locacao locacao;
		
		locacao = lS.alugarFilme(usuario, filmes);
		
		//Verificação
		error.checkThat(locacao.getValor(),is(10.0));
		error.checkThat(locacao.getValor(),is(not(6.0)));
			//error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(),new Date()),is(true));
			//error.checkThat(locacao.getDataRetorno(),MatchersProprios.ehHojeComDIferencaDeDias(1));
			//error.checkThat(locacao.getDataRetorno(),MatchersProprios.ehHoje());
		
		
		//Usando Assert
//		Assert.assertEquals(5.0,locacao.getValor(),0.1);
//		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(),new Date()));
//		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
		
		//Usando AssertThat
//		assertThat(locacao.getValor(),is(5.0));
//		assertThat(locacao.getValor(),is(not(6.0)));
//		assertThat(DataUtils.isMesmaData(locacao.getDataLocacao(),new Date()),is(true));
		
		//Usando Error Colector  - Mapeia todas as falhas
//		error.checkThat(locacao.getValor(),is(5.0));
//		error.checkThat(locacao.getValor(),is(not(6.0)));
//		error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(),new Date()),is(true));
		
		
	}
	
	

	
	
	//Metódo statico usando powerMockito
	@Test	
	public void deveDevolverNaSegundaSeAlugarNoSabado() throws Exception {
		Assert.assertFalse(DataUtils.verificarDiaSemana(new Date(), Calendar.SATURDAY));
		
		//Cenário
		Usuario usuario = UsuarioBuilder.umUsuario().agora();			
		List<Filme> filmes = Arrays.asList(FilmeBuilder.umFilme().agora());
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH,29);
		calendar.set(Calendar.MONTH,Calendar.APRIL);
		calendar.set(Calendar.YEAR,2017);
		PowerMockito.mockStatic(Calendar.class);
		PowerMockito.when(Calendar.getInstance()).thenReturn(calendar);
		
		//Ação
		
		Locacao locacao_resultado = lS.alugarFilme(usuario, filmes);
		
		
		//Verificação	
			
		
		assertThat(locacao_resultado.getDataRetorno(), caiNumaSegunda());
		PowerMockito.verifyStatic(Mockito.times(2));
		Calendar.getInstance();
		
	}
	
	


	@Test
	public void deveAlugarFilme_SemCalcularVaalor() throws Exception{
		//cenário
		Usuario usuario = umUsuario().agora();
		List<Filme>filmes = Arrays.asList(umFilme().agora());
		
		PowerMockito.doReturn(1.0).when(lS,"calcularValorLocacao",filmes);
		
		//ação
		Locacao locacao= lS.alugarFilme(usuario, filmes);
		
		//verificação
		Assert.assertThat(locacao.getValor(),is(1.0));
		PowerMockito.verifyPrivate(lS).invoke("calcularValorLocacao",filmes);
		
		
	}
	
	@Test
	public void deveCalcularValorLocacao() throws Exception {
		//cenário
		List<Filme>filmes = Arrays.asList(umFilme().agora());
		
		//ação
		Double valor = (Double) Whitebox.invokeMethod(lS, "calcularValorLocacao",filmes);
		
		//verificação
		Assert.assertThat(valor,is(10.0));
		
	}
	
	
	
	
}