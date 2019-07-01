package edu.br.biblioteca.modelo;

public class Usuario {
	
	private String matricula;
	private String email;
	private String senha;
	
	
	/**
	 * 
	 */
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param matricula
	 * @param email
	 */
	public Usuario(String matricula, String email) {
		super();
		this.matricula = matricula;
		this.email = email;
	}


	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
