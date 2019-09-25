package br.treino.pattern.test;

import br.treino.pattern.entity.Artigo;
import br.treino.pattern.entity.BlogBuilder;
import br.treino.pattern.entity.JornalBuilder;
import br.treino.pattern.entity.RevistaBuilder;

public class TestaCriacaoArtigo {

	public static void main(String[] args) {
		
		CriadorDeArtigo criaArtigo = new CriadorDeArtigo();
		
		RevistaBuilder revistaBuilder = new RevistaBuilder();
		criaArtigo.artigoRevista(revistaBuilder); 
		
		JornalBuilder jornalBuilder = new JornalBuilder(); 
		criaArtigo.artigoJornal(jornalBuilder); 
		
		BlogBuilder blogBuilder = new BlogBuilder(); 
		criaArtigo.artigoBlog(blogBuilder); 
		
		System.out.println("\n"+revistaBuilder.toString()); 
		System.out.println("\n"+jornalBuilder.toString()); 
		System.out.println("\n"+blogBuilder.toString()); 
 

		Artigo j = jornalBuilder.obterJornal();
		System.out.println("\n "+j.getTipo()  
		                   +"\n "+ j.getTitulo()
		                   +"\n "+ j.getAutor()); 
	}

}
