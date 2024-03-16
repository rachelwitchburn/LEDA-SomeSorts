package selectionSort;

import java.util.Arrays;

public class Main {

	
	public static int[] selectionSort(int[] vetor) {
		int trocas = 0;
		long inicio = System.nanoTime();
		for (int i = 0; i < vetor.length; i++) {
			int menor = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[menor]) {
					menor = j;  //atualiza endereço, e não o valor
				}
			}
			int aux = vetor[i];
			vetor[i] = vetor[menor];
			vetor[menor] = aux;
			trocas++;
		}
		long fim = System.nanoTime();
		System.out.println("Tempo de ordenação: "+tempo(inicio, fim));
		System.out.println("TROCAS: "+ trocas);
		return vetor;
	}
	
	public static double tempo(long inicio, long fim) {
		double tempo_final = ((fim - inicio)/1000000.0);
		return tempo_final;
	}
	
	public static void main(String[] args) {
		int [] vetor = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			
		}
		System.out.println("Lista desordenada: ");
		System.out.println(Arrays.toString(vetor));
		System.out.println("Lista ordenada: "+ Arrays.toString(selectionSort(vetor)));
	}

}
