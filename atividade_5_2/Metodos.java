package atividade_5_2;

import javax.swing.JOptionPane;

public class Metodos {
	
	private NO inicio;
	private int tamanho;
	private Curso[] dadoscurso;
	
	public Metodos() {
		this.inicio = null;
	}

	public void adicionaFinal(Curso curso) {
		NO novoCurso = new NO(curso);
		
		if (inicio == null) {
			this.inicio = novoCurso;
		} else {
			NO aux = BuscaUltimo(inicio);	
			novoCurso.anterior = aux;
			aux.proximo = novoCurso;
			this.tamanho ++;
		}
	}
	
	public NO BuscaUltimo(NO aux) {
		if(aux.proximo!=null) {
			return BuscaUltimo(aux.proximo);
		}
		return aux;
	}
	
	public void removeFinal() {
		if (this.estaVazia()) {
			System.out.println("Lista vazia, portanto nao pode ser removido");
		} else {
			NO aux = BuscaUltimo(inicio);
			JOptionPane.showMessageDialog(null, "Curso: " + aux.dados.getNome() + " removido");
			NO aux2 = aux.anterior;
			aux2.proximo = null;
			aux = null;
			this.tamanho --;
		}
	}
	
	public boolean estaVazia() {
		if (inicio == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public String mostraLista(NO aux, String resultadoPesquisa, boolean primeiraExecucao) {
		if(primeiraExecucao){
			aux = inicio;
			primeiraExecucao=false;
		}
		
		if(aux != null) {
			resultadoPesquisa = resultadoPesquisa + "\n Aluno: " + aux.dados.getNome();
			return mostraLista(aux.proximo, resultadoPesquisa, primeiraExecucao);
		}
		return resultadoPesquisa;
	}
}
