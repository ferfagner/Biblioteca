package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class BDSimulado {
	
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();
	private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	public BDSimulado(){
		//Criando Livros
		Livro l1 = new Livro("Livro1", "Autor1", "Editora1", "2012", "123");
		Livro l2 = new Livro("Livro1", "Autor1", "Editora1", "2012", "123");
		Livro l3 = new Livro("Livro1", "Autor1", "Editora1", "2012", "123");
		//Adicionando Livros
		this.livros.add(l1);
		this.livros.add(l2);
		this.livros.add(l3);
		
		//Criando Usuarios
		Usuario u1 = new Usuario("Usuario1", "123", "Curso1");
		Usuario u2 = new Usuario("Usuario2", "456", "Curso2");
		
		//Adicionando Usuarios
		this.usuarios.add(u1);
		this.usuarios.add(u2);
		
		
		//Criar Bibliotecario
		Bibliotecario b1 = new Bibliotecario("Bibli1", "123");
		Bibliotecario b2 = new Bibliotecario("Bibli2", "456");
		
		//Adicionando Biblioteca
		this.bibliotecarios.add(b1);
		this.bibliotecarios.add(b2);
		
		//Criando emprestimo
		Emprestimo e1= new Emprestimo(l1, u1, b2, LocalDate.of(2017, 10, 10), LocalDate.of(2017, 10, 15));
		Emprestimo e2= new Emprestimo(l2, u2, b1, LocalDate.of(2017, 10, 15), LocalDate.of(2017, 10, 16));
		Emprestimo e3= new Emprestimo(l3, u1, b1, LocalDate.of(2017, 10, 10), LocalDate.of(2017, 10, 20));
		
		//Adicionando Emprestimo
		this.emprestimos.add(e1);
		this.emprestimos.add(e2);
		this.emprestimos.add(e3);
		
		
		
		
	}

	//recupera arraylist de emprestimos
	
	public ArrayList<Emprestimo> getEmprestimo(){
		return this.emprestimos;
	}

}