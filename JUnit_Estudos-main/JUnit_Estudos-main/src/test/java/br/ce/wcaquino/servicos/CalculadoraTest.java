package br.ce.wcaquino.servicos;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;
import br.ce.wcaquino.runners.ParallelRunner;


@RunWith(ParallelRunner.class)
public class CalculadoraTest {
	
	private Calculadora cal;
	
	@Before
	public void setup() {
		setCal(new Calculadora());
		System.out.println("Iniciando teste");
	}
	
	@After
	public void tearDonw() {
		System.out.println("Finalizando teste");
	}
	
	@Test
	public void somarDoisValores() {
		//Cenario
		int a = 10;
		int b= 5;
		
				
		//ação
		int resultado = cal.somar(a,b);
		
		//Verificação
		Assert.assertEquals(15,resultado);
		
		
		
	}
	
	@Test
	public void subtrairDoisValores() {
		
		int a = 13;
		int b = 12;
		
		
		
		int resultado = cal.subtrair(a,b);
		
		Assert.assertEquals(1,resultado);
				
		
		
	}
	
	@Test
	public void dividirDoisValores() throws NaoPodeDividirPorZeroException {		
		int a = 10;
		int b = 5;
						
		int resultado = cal.dividir(a,b);
		
		Assert.assertEquals(2,resultado);
		
	}
	
	@Test(expected = NaoPodeDividirPorZeroException.class)
	public void impedirDividirPorZero() throws NaoPodeDividirPorZeroException {		
		int a = 10;
		int b = 0;
						
		int resultado = cal.dividir(a,b);
		
		Assert.assertEquals(1,resultado);
		
	}
	
	@Test
	public void multiplicarValores() {
		
		int a = 10;
		int b = 10;
		
		int resultado = cal.multiplicar(a,b);
		
		Assert.assertEquals(100,resultado);
		
	}

	public Calculadora getCal() {
		return cal;
	}

	public void setCal(Calculadora cal) {
		this.cal = cal;
	}
	
	

}
