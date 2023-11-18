package com.estudosSB.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.estudosSB.api.entities.Login;
import com.estudosSB.api.entities.Mensalidade;
import com.estudosSB.api.entities.Socio;
import com.estudosSB.api.entities.Usuario;
import com.estudosSB.api.repositories.LoginRepository;
import com.estudosSB.api.repositories.MensalidadeRepository2;
import com.estudosSB.api.repositories.SocioRepository;
import com.estudosSB.api.repositories.UsuarioRespository;


@SpringBootApplication
public class EstudosSpringBootApiApplication implements CommandLineRunner {

	@Autowired
	private LoginRepository cursoRepository;
	
	@Autowired
	private UsuarioRespository usuRespository;
	
	@Autowired
	private SocioRepository socioRepository;
	
	@Autowired
	private MensalidadeRepository2 mensalidadeRepository2;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(EstudosSpringBootApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Login login = new Login();
		login.setLogin("Nogin02");
		login.setSenha("senha123");
		
		Login login2 = new Login();
		login2.setLogin("Savio01");
		login2.setSenha("123");
		
		Login login3 = new Login();
		login3.setLogin("Ana01");
		login3.setSenha("senha123");
		
		Login login4 = new Login();
		login4.setLogin("Sabrina02");
		login4.setSenha("123");
		
		Login login5 = new Login();
		login5.setLogin("Gabi02");
		login5.setSenha("123");
		
		
		
		Usuario usu = new Usuario();
		usu.setCargo("ADM");
		usu.setLogin(login);
		usu.setName("Noginaldo");
		
		Usuario usu2 = new Usuario();
		usu2.setCargo("Financeiro");
		usu2.setLogin(login2);
		usu2.setName("Sávio");
		
		Usuario usu3 = new Usuario();
		usu3.setCargo("ADM");
		usu3.setLogin(login3);
		usu3.setName("Ana");
		
		
		
		

		usuRespository.save(usu);
		usuRespository.save(usu2);
		usuRespository.save(usu3);
		
		cursoRepository.save(login);
		cursoRepository.save(login2);
		cursoRepository.save(login3);
		cursoRepository.save(login4);
		cursoRepository.save(login5);
		
		Mensalidade mensalidade_socio01 = new Mensalidade();
		
		
		
		Socio socio = new Socio("PIX","Sávio");
		socio.setFormaPagamento("PIX");
		socio.setNome("Sávio Arthur");
		
//		
//		mensalidade_socio01.setValor(70);
//		mensalidade_socio01.setSocio(socio);
//		mensalidade_socio01.setStatus("Devendo");
	
		Mensalidade mensalidade_socio02 = new Mensalidade();
		Mensalidade mensalidade_socio03 = new Mensalidade();
		
		
		
		Socio socio2 = new Socio("Boleto","Ana");
		
//		
//		mensalidade_socio02.setSocio(socio2);
//		mensalidade_socio03.setSocio(socio2);
//		mensalidade_socio03.setValor(70);
//		mensalidade_socio02.setValor(70);
//		mensalidade_socio02.setStatus("Pago");
//		mensalidade_socio03.setStatus("à pagar");
//		mensalidade_socio02.setName("Janeiro");
//		mensalidade_socio03.setName("Fevereiro");
//		

		
		
		socioRepository.save(socio);
		socioRepository.save(socio2);
//		
//		mensalidadeRepository2.saveAll(socio.getMensalidades());
//		mensalidadeRepository2.saveAll(socio2.getMensalidades());
//		
		
		
		
//		List<Login> listadeLogins = cursoRepository.findAll();
//		listadeLogins.forEach(login_encontrado -> System.out.println(login_encontrado));
		
//		List<Login> loginsporID = cursoRepository.findLoginBylogin("Login02");
//		loginsporID.forEach(login_novo -> System.out.println(login_novo));
		
//		List<Login> loginsPorContem = cursoRepository.findLoginByloginContaining("01");
//		loginsPorContem.forEach(login_novo -> System.out.println(login_novo));
		
//		List<Login> loginsComLikeIgnoreCase = cursoRepository.findLoginByloginLikeIgnoreCase("%Login%");
//		 loginsComLikeIgnoreCase.forEach(login_novo -> System.out.println(login_novo));
		
		
//		List<Login> logins3Query = cursoRepository.findByQueryLogin();
//		logins3Query.forEach(login_novo -> System.out.println(login_novo));
	
//		List<String> logins3QueryPorSenha = cursoRepository.findByQueryLoginPorSenha();
//		logins3QueryPorSenha.forEach(login_novo -> System.out.println(login_novo));
		
//		List<String> logins3QueryPorSenhaInformada = cursoRepository.findByQueryLoginPorSenhaInformada("123");
//		logins3QueryPorSenhaInformada.forEach(login_novo -> System.out.println(login_novo));
		
//		List<String> logins3QueryPorVariosParam = cursoRepository.findByQueryLoginPorVariosParametros("123","Gabi02");
//		logins3QueryPorVariosParam.forEach(login_novo -> System.out.println(login_novo));
//		
//		List<String> logins3QueryPorVariosSemParam = cursoRepository.findByQueryLoginPorVariosSemParametros("123","Savio01");
//		logins3QueryPorVariosSemParam.forEach(login_novo -> System.out.println(login_novo));
		
		
		
	}

}
