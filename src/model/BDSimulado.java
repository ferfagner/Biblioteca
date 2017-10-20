package model;

import java.util.ArrayList;

public class BDSimulado {
	
	private ArrayList<Livro> livro = new ArrayList<Livro>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();
	private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	public BDSimulado(){
		//Criando Livros
		Livro 11 = new Livro("Livro1","Autor1","Editora1","2012","123");
		Livro 12 = new Livro("Livro1","Autor1","Editora1","2012","123");
		Livro 13 = new Livro("Livro1","Autor1","Editora1","2012","123");
		
		//Adicionando Livros
		this.livros.add(11);
		this.livros.add(12);
		this.livros.add(13);
		
		//Criando Usuarios
		Usuario u1 = new Usuario("Usuario1", "123", "Curso1");
		Usuario u2 = new Usuario("Usuario2", "456", "Curso2");
		
		//Adicionando Usuarios
		this.usuarios.add(u1);
		this.usuarios.add(u2);
		
		
		//Criar Bibliotecario
		Bibliotecario b1 = new Bibliotecario("Bibli1", "123");
		Bibliotecario b2 = new Bibliotecario("Bibli2", "456");
		
		this.bibliotecarios.add(b1);
		this.bibliotecarios.add(b2);
		
	}



}