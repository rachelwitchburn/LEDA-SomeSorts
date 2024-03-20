package insertionSort;

public class Main {

	public static int[] insertionSort(int[] vetor) {
		int trocas = 0;
		long inicio = System.nanoTime();
		int aux, j;
		for (int i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i - 1;
			while (j >= 0 && vetor[j] > aux) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j+1] = aux;
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
		int [] vetor = new int [10];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}
		
		System.out.println("Lista desordenada: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if (i < vetor.length - 1) {
				System.out.print(", ");

			}
		}
		System.out.println();
		insertionSort(vetor);
		System.out.println("Lista ordenada: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if (i < vetor.length - 1) {
				System.out.print(", ");

			}
		}
		
	}
	

}
