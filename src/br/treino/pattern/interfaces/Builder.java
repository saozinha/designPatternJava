package br.treino.pattern.interfaces;

import java.util.Date;

import br.treino.pattern.entity.Tipo;


/**
 * @author conceicaolourenco
 * 
 * Classe  base , descreve a forma como o objeto deverá ser criado.
 *
 */
public interface Builder {

	void setTipo(Tipo tipo);

	void setTitulo(String titulo);

	void setAutor(String autor);

	void setDataPublicacao(Date dataPublicacao);

	void setTexto(String texto);

	void setResumo(String resumo);

	void setNumeroPaginas(int numeroPaginas);

}
