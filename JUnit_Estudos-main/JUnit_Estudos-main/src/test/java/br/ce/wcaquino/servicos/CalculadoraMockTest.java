package br.ce.wcaquino.servicos;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class CalculadoraMockTest {

	@Mock // Comportamento normal é NÃO executar o método, se não for oq espera retorna o valor null,0, depende do tipo do método
	private Calculadora calculadora_mock;
	
	@Spy // Comportamento normal é executar o método, se não for oq espera retorna o valor real
	private Calculadora calculadora_spy;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	
	public void devoMostrarDiferencaEntreMockeSpy() {
		Mockito.when(calculadora_mock.somar(1, 2)).thenCallRealMethod(); //para chamar o resultado real do método
		Mockito.when(calculadora_spy.somar(1, 2)).thenReturn(5);
		Mockito.doReturn(5).when(calculadora_spy).somar(1,2);
		Mockito.doNothing().when(calculadora_spy).imprimir();
		
		System.out.println("Mock:" + calculadora_mock.somar(1, 3));
		System.out.println("Spy:" + calculadora_spy.somar(1, 3));
		
		
		System.out.println("Mock - Imprime:");
		calculadora_mock.imprimir();
		System.out.println("Spy - Imprime:" );
		calculadora_spy.imprimir();
		
		
		
		
	}
	
	@Test
	public void teste() {
		
		Calculadora calculadora = Mockito.mock(Calculadora.class);
		ArgumentCaptor<Integer> argumentoCaptor = ArgumentCaptor.forClass(Integer.class);
		Mockito.when(calculadora.somar(argumentoCaptor.capture(), argumentoCaptor.capture())).thenReturn(4);
		
		System.out.println(calculadora.somar(2, 1));
		
	}
	
	
}
