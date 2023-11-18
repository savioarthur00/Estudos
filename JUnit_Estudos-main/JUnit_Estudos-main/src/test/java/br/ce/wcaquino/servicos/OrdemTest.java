package br.ce.wcaquino.servicos;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


//Garante que os testes serão testados em ordem alfabetica!
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrdemTest {
	
	private static int cont = 0;
		
	@Test
	public void inicia() {
		cont=1;
	}
	
	@Test
	public void verifica() {
		assertEquals(1,cont);
	}

}
