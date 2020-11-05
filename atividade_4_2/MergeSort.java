package atividade_4_2;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int lista[] = {11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82};
		int inicio = 0;
		int fim = lista.length - 1;
		
		mergeSortRecursivo(lista, inicio, fim);
		System.out.println(Arrays.toString(lista));

	}
	
	public static void mergeSortRecursivo(int lista[], int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSortRecursivo(lista, inicio, meio);
			mergeSortRecursivo(lista, meio + 1, fim);
			mesclar(lista, inicio, meio, meio + 1, fim);
		}
	}

	private static void mesclar(int[] lista, int inicioA, int fimA, int inicioB, int fimB) {
		int i1 = inicioA;
		int i2 = inicioB;
		int iaux = inicioA;
		int aux[] = new int[lista.length];
		
		while (i1 <= fimA && i2 <= fimB) {
			if(lista[i1] <= lista[i2])
				aux[iaux ++] = lista[i1 ++];
			else
				aux[iaux ++] = lista[i2 ++];
		}
		while (i1 <= fimA)
			aux[iaux ++] = lista[i1 ++];
		while (i2 <= fimB)
			aux[iaux ++] = lista[i2 ++];
		for (int i = inicioA; i <= fimB; i ++)
			lista[i] = aux[i];
		
	}

}
