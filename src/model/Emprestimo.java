package model;

import java.time.LocalDate;

public class Emprestimo {
	private Livro livro;
	private Usuario usuario;
	private Bibliotecario bibliotecario;
	private LocalDate dataRetirada;
	private LocalDate dataDevolução;
	
	
	public Emprestimo(Livro livro, Usuario usuario, Bibliotecario bibliotecario, LocalDate dataRetirada,
			LocalDate dataDevolução) {
		super();
		this.livro = livro;
		this.usuario = usuario;
		this.bibliotecario = bibliotecario;
		this.dataRetirada = dataRetirada;
		this.dataDevolução = dataDevolução;
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


	public LocalDate getDataDevolução() {
		return dataDevolução;
	}


	public void setDataDevolução(LocalDate dataDevolução) {
		this.dataDevolução = dataDevolução;
	}
	
	
	
	
}
