package br.treino.pattern.entity;

import java.util.Date;

public class Artigo {

	private Tipo tipo;
	private String titulo;
	private String autor;
	private Date dataPublicacao;
	private String texto;
	private String resumo;
	private int numeroPaginas;

	public Artigo() {
	}

	public Artigo(Tipo tipo, String titulo, String autor, Date dataPublicacao, String texto, String resumo,
			int numeroPaginas) {
		super();
		this.tipo = tipo;
		this.titulo = titulo;
		this.autor = autor;
		this.dataPublicacao = dataPublicacao;
		this.texto = texto;
		this.resumo = resumo;
		this.numeroPaginas = numeroPaginas;
	}

	public Artigo(Tipo tipo, String titulo, String autor, Date dataPublicacao, String texto) {
		super();
		this.tipo = tipo;
		this.titulo = titulo;
		this.autor = autor;
		this.dataPublicacao = dataPublicacao;
		this.texto = texto;
	}

	// Setters e Getters
	
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getTexto() {
		return texto;
	}

	protected void setTexto(String texto) {
		this.texto = texto;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

}
