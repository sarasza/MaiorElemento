package Atividade;

public class Maior {

	public static void main(String[] args) {
		int vetor[] = {1, 9, 2, 8, 3, 7, 4, 6, 5};
		System.out.println("Maior elemento: " + resultado(vetor, 0, vetor.length));
	}

	public static int resultado(int vetor[], int i, int maior) {
		if (i == vetor.length) { 
			return maior;
		} else {
			if (maior < vetor[i]) {
				maior = vetor[i];
			}
			return resultado(vetor, i + 1, maior);
		}
	}
}
