package bubbleSort;

import java.util.Arrays;

public class Main {
	public static int[] bubbleSort(int[] vetor) {
		int trocas = 0;
		long inicio = System.nanoTime();
		for (int i = 0; i < vetor.length; i++) {
			int aux;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
					trocas++;
				}
			}
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
		int [] vetor = new int [100];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}
		System.out.println("Lista desordenada: ");
		System.out.println(Arrays.toString(vetor));
		System.out.println("Lista ordenada: "+ Arrays.toString(bubbleSort(vetor)));
		//int [] vetor = {2, 9, 3, 8, 7, 2, 1, 6, 9};
	}

}

