package br.treino.pattern.entity;

import java.util.Date;

import br.treino.pattern.interfaces.Builder;

public class RevistaBuilder implements Builder {

	private Tipo tipo;
	private String titulo;
	private String autor;
	private Date dataPublicacao;
	private String texto;
	private String resumo;
	private int numeroPaginas;


	public Artigo obterRevista() {
		return new Artigo(tipo, titulo, autor, dataPublicacao, texto, resumo, numeroPaginas); 
	}
	@Override
	public String toString() {
		return  tipo + " {  autor:'" + autor + '\'' 
				+ ",\n           titulo:'" + titulo 
				+"',\n           publicado Em: '" + dataPublicacao  
				+"',\n            Resumo:'" + resumo
				+"',\n            texto:'" + texto 
				+"', \n            paginas:'" + numeroPaginas 
				+"'\n } ";
	}
	
	//Setter and Getters
	@Override
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	@Override
	public void setTexto(String texto) {
		this.texto = texto;
	}
	@Override
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	@Override
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
}
