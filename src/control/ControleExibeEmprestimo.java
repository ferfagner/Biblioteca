package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Emprestimo;

public class ControleExibeEmprestimo {
	
	public ControleExibeEmprestimo(){
		//criando BD Simulado
		BDSimulado bds = new BDSimulado();
		
		//Recuperar todos os emprestimos
		ArrayList<Emprestimo> emprestimos = bds.getEmprestimo();
		
		//exibir todos os emprestimos
		
		
	}
}
