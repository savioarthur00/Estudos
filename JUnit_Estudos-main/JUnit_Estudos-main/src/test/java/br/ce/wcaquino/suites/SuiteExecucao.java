package br.ce.wcaquino.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.wcaquino.servicos.CalcularLocacaoTest;
import br.ce.wcaquino.servicos.LocacaoServiceTest;
import br.ce.wcaquino.servicos.OrdemTest;


@RunWith(Suite.class)
@SuiteClasses({
	//CalculadoraTest.class,
	CalcularLocacaoTest.class,
	LocacaoServiceTest.class,
	OrdemTest.class	
	
})


public class SuiteExecucao {

	
	
	
}
