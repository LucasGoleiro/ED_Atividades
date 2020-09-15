package atividade_1;

import javax.swing.JOptionPane;

public class TesteAluno {

	public static void main(String[] args) {
		ListaAlunos lista= new ListaAlunos();
		Aluno aluno;
		int pos;
		int opc = 0;
		int ra;
		String nome;
		String turma;
		String semestre;
		String retorno;
		
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adiciona final\n2 - Adiciona inicio\n3 - Adiciona meio\n4 - Remove final\n5 - Remove inicio\n6 - Remove meio\n7 - Mostra lista\n9 - Sair")); 
			
			switch(opc) {
			case 1: ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno:"));
					nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
					turma = JOptionPane.showInputDialog("Digite a turma do aluno:");
					semestre = JOptionPane.showInputDialog("Digite o semestre do aluno:");
					aluno = new Aluno(ra, nome, turma, semestre);
					lista.AdicionaFinal(aluno);
			break;
			
			case 2: ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno:"));
					nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
					turma = JOptionPane.showInputDialog("Digite a turma do aluno:");
					semestre = JOptionPane.showInputDialog("Digite o semestre do aluno:");
					aluno = new Aluno(ra, nome, turma, semestre);
					lista.AdicionaInicio(aluno);
			break;
			
			case 3: ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno:"));
					nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
					turma = JOptionPane.showInputDialog("Digite a turma do aluno:");
					semestre = JOptionPane.showInputDialog("Digite o semestre do aluno:");
					aluno = new Aluno(ra, nome, turma, semestre);
					pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao a ser inserida: "));
					lista.escolhePosicao(aluno, pos);
			break;
			
			case 4: aluno = lista.RemoveFinal();
					JOptionPane.showMessageDialog(null, "Aluno: " +aluno.getNome()+ " removido do final");
			break;
			
			case 5: aluno = lista.RemoveInicio();
			JOptionPane.showMessageDialog(null, "Aluno: " +aluno.getNome()+ " removido do inicio");
			break;
			
			case 6: pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao a ser removida: "));
					aluno = lista.escolheRemove(pos);
					JOptionPane.showMessageDialog(null, "Aluno: " +aluno.getNome()+ " removido");
			break;
			
			case 7: retorno = lista.percorre();
					JOptionPane.showMessageDialog(null, retorno);
			break;
			}
		}

	}

}
