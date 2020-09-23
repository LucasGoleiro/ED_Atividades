package atividade_2_2;

import javax.swing.*;
public class TesteLista {
	public static void main(String[]args){
		Lista temperaturas=new Lista();                   
		int op=0,temperatura,pos;
		while(op!=99){
			op=Integer.parseInt(JOptionPane.showInputDialog("Cadastro\n1-Adiciona Final\n2-Adiciona In�cio\n3-Adiciona em uma posi��o espec�fica\n"
					+ "4-Remove Final\n5-Remove In�cio\n6-Remove de uma posi��o espec�fica\n7-Mostra Elementos\n99-Sair"));

			switch(op){
			case 1:
				temperatura=Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura"));
				temperaturas.AdicionaFinal(temperatura);
				break;
			case 2:
				temperatura=Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura"));
				temperaturas.AdicionaInicio(temperatura, 4);
				break;
			case 3:
				temperatura=Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura"));
				pos=Integer.parseInt(JOptionPane.showInputDialog("Informe a posicao do vetor que voc� deseja inserir a temperatura"));
				pos=pos-1;     			
				temperaturas.AdicionaQualquerPosicao(temperatura, pos);
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"O elemento removido foi:"+temperaturas.RemoveFinal());
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"O elemento removido foi:"+temperaturas.RemoveInicio());
				break;
			case 6:
				pos=Integer.parseInt(JOptionPane.showInputDialog("Informe a posi��o do vetor que voc� deseja remover a temperatura"));
				pos=pos-1;     
				JOptionPane.showMessageDialog(null,"O elemento removido foi:"+temperaturas.RemoveQualquerPosicao(pos));
				break;
			case 7:
				JOptionPane.showMessageDialog(null,"Lista:"+temperaturas.percorre());       
				break;
			case 99:
				JOptionPane.showMessageDialog(null,"Saindo");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Op��o inv�lida");
			}
		}
	}
}

