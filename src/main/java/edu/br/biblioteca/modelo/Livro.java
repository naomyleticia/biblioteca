package edu.br.biblioteca.modelo;

public class Livro {
	
	private int numPaginas;
	private String titulo;
	private String autor;
	
	
	
	/**
	 * @param titulo
	 * @param autor
	 */
	public Livro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}
	/**
	 * 
	 */
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the numPaginas
	 */
	public int getNumPaginas() {
		return numPaginas;
	}
	/**
	 * @param numPaginas the numPaginas to set
	 */
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	

}
