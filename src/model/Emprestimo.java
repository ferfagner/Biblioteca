package model;

import java.time.LocalDate;

public class Emprestimo {
	private Livro livro;
	private Usuario usuario;
	private Bibliotecario bibliotecario;
	private LocalDate dataRetirada;
	private LocalDate dataDevolu��o;
	
	
	public Emprestimo(Livro livro, Usuario usuario, Bibliotecario bibliotecario, LocalDate dataRetirada,
			LocalDate dataDevolu��o) {
		super();
		this.livro = livro;
		this.usuario = usuario;
		this.bibliotecario = bibliotecario;
		this.dataRetirada = dataRetirada;
		this.dataDevolu��o = dataDevolu��o;
	}


	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}


	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}


	public LocalDate getDataRetirada() {
		return dataRetirada;
	}


	public void setDataRetirada(LocalDate dataRetirada) {
		this.dataRetirada = dataRetirada;
	}


	public LocalDate getDataDevolu��o() {
		return dataDevolu��o;
	}


	public void setDataDevolu��o(LocalDate dataDevolu��o) {
		this.dataDevolu��o = dataDevolu��o;
	}
	
	
	
	
}
