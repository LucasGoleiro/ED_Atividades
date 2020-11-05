package atividade_4_1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class QuickSort {

	public static void main(String[] args) {
		int vet[] = {11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82, 42, 55, 78};
		int ini = 0;
		int fim = vet.length - 1;
		
		quickSort(vet, ini, fim);
		System.out.println(Arrays.toString(vet));

	}
	
	public static void quickSort(int vet[], int ini, int fim) {
		int divisao;
		if (ini < fim) {
			divisao = particao(vet, ini, fim);
			quickSort(vet, ini, divisao - 1);
			quickSort(vet, divisao + 1, fim);
		}
	}

	private static int particao(int[] vet, int ini, int fim) {
		int pivo = vet[ini];
		int i = ini + 1;
		int f = fim;
		int aux;
		
		while (i <= f) {
		
			while (i <= fim && vet[i] <= pivo)
				++i;
			
			while (pivo < vet[f])
				--f;
			
			if (i < f) {
				aux = vet[i];
				vet[i] = vet[f];
				vet[f] = aux;
				++i;
				--f;
			}
		}
		if (ini != f) {
			vet[ini] = vet[f];
			vet[f] = pivo;
		}
		return f;
	}

}
