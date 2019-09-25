package br.treino.pattern.test;

import java.util.Date;

import br.treino.pattern.entity.Tipo;
import br.treino.pattern.interfaces.Builder;

 

/**
 * @author conceicaolourenco
 * 
 * Classe Diretora define a ordem das etapas de construção. 
 * Funciona com um objeto construtor    através da interface comum do Builder.
 * Portanto, pode não saber qual é o produto    sendo construído.
 *
 */
public class CriadorDeArtigo {

	public void artigoJornal(Builder builder) {
		builder.setTipo(Tipo.JORNAL);
		builder.setTitulo("Testando padrão Builder ");
        builder.setAutor("Conceicao Lourenco");
        builder.setTexto("O padrão builder auxilia na criação de objetos que possuem caracteristicas semellhantes");
        builder.setDataPublicacao(new Date());
    }
	
	public void artigoRevista(Builder builder) {
		builder.setTipo(Tipo.REVISTA);
		builder.setTitulo("Dividindo responsabildades com padrão Builder ");
        builder.setAutor("Conceicao Lourenco");
        builder.setTexto("O padrão builder auxilia a separação de objetos com construtores diferentes");
        builder.setDataPublicacao(new Date());
        builder.setResumo("Padroniza usando builder");
        builder.setNumeroPaginas(10);
    }
	
	public void artigoBlog(Builder builder) {
		builder.setTipo(Tipo.BLOG);
		builder.setTitulo("Enquete do padrão Builder ");
        builder.setAutor("Conceicao Lourenco");
        builder.setTexto("Usar padrão builder na criação de objetos com construtores diferentes");
        builder.setDataPublicacao(new Date()); 
    }
}
