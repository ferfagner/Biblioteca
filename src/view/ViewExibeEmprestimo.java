package view;

import java.util.ArrayList;

import model.Emprestimo;

public class ViewExibeEmprestimo {
	public ViewExibeEmprestimo(ArrayList<Emprestimo> emprestimos){
		//Exibir todos os Emprestimos
		for (int i = 0; i < emprestimos.size(); i++) {
			//imprimir no console
			System.out.println("----------");
			System.out.println("Titulo: " + emprestimos.get(i).getLivro().getTitulo() + "\n");
			System.out.println("Autor: " + emprestimos.get(i).getLivro().getAutor() + "\n");
			System.out.println("Usuario: " + emprestimos.get(i).getUsuario().getNome() + "\n");
			System.out.println("Data de Retirada: " + emprestimos.get(i).getDataRetirada() + "\n");
			System.out.println("Data de Devolução: " + emprestimos.get(i).getDataDevolução() + "\n");
			
		}
	}
}
