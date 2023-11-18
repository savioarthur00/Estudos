package br.ce.wcaquino.builders;

import br.ce.wcaquino.entidades.Filme;

public class FilmeBuilder {

	
	private Filme filme;

	private FilmeBuilder() {
		
	}
	
	public static FilmeBuilder umFilme() {
		FilmeBuilder filmeBuilder = new FilmeBuilder();
		filmeBuilder.filme = new Filme();
		filmeBuilder.filme.setEstoque(10);
		filmeBuilder.filme.setNome("Filme Genérico");
		filmeBuilder.filme.setPrecoLocacao(10.0);
		
		return filmeBuilder;
	}
	public static FilmeBuilder umFilmeSemEstoque() {
		FilmeBuilder filmeBuilder = new FilmeBuilder();
		filmeBuilder.filme = new Filme();
		filmeBuilder.filme.setEstoque(0);
		filmeBuilder.filme.setNome("Filme Genérico");
		filmeBuilder.filme.setPrecoLocacao(10.0);
		
		return filmeBuilder;
	}
	
	public Filme agora() {
		return filme;
	}
	
	public FilmeBuilder comValor(double valor) {
		filme.setPrecoLocacao(valor);
		return this;
	}
	
	public FilmeBuilder semEstoque() {
		filme.setEstoque(0);
		return this;
	}
	
	
	
}
