package atividade_5_2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Metodos listaDupla = new Metodos();
		int id;
		String nome;
		String semestre;
		int duracao;
		int opc = 0;
		
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adiciona Final /n2 - Remove Final /n3 - Mostra /n9 - Sair"));
			switch(opc) {
			case 1: id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do curso"));
					nome = JOptionPane.showInputDialog("Digite o Nome do curso");
					semestre = JOptionPane.showInputDialog("Digite o Semestre do curso");
					duracao = Integer.parseInt(JOptionPane.showInputDialog("Digite a Duracao do curso"));
					Curso curso = new Curso(id, nome, semestre, duracao);
					listaDupla.adicionaFinal(curso);
			break;
			
			case 2: listaDupla.removeFinal();
			break;
			
			case 9: System.exit(0);
			}
		}

	}

}
