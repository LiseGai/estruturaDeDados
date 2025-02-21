package ExerciciosDeRevisaoAula01;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio01Aula01 {
	public static void main(String[] args) {
		Random rand = new Random(); // Para os números aleatórios
		int vetor[] = new int[500]; // declaração combinada
        ArrayList<Integer> vetorPar = new ArrayList<>();
        ArrayList<Integer> vetorImpar = new ArrayList<>();
		
		int limiteSuperior=100;
		
		//Populando o vetor:
		for (int i=0; i<vetor.length; i++) {
			vetor[i]=rand.nextInt(limiteSuperior);
			//Insira no vetorPar os números pares e no vetorImpar os números ímpares:
			if (vetor[i]%2==0) vetorPar.add(vetor[i]);
			else vetorImpar.add(vetor[i]);
		}
		
		/*
		 * Para limitar o tamanho do número gerado em rand.nextInt() basta usar o exemplo abaixo:
		 * int limiteSuperior = 100;
		 * random.nextInt(limiteSuperior);
		 * 
		 * E se quiser um limite mínimo e um máximo se gera com: 
		 * double min = 1.5;  // limite mínimo
        	double max = 10.5; // limite máximo
		 * random.nextInt(max - min + 1) gera um número entre 0 e (max - min), e depois somamos o valor 
		 * de min para garantir que o número fique dentro do intervalo entre min e max (inclusive).
		 */
		
		System.out.println("Imprimindo o Vetor original:\n");
		for (int i=0; i<vetor.length;i++) System.out.print(vetor[i]+"\t");
        // Exibindo os números pares
        System.out.println("\nVetor Par:");
        for (int i = 0; i < vetorPar.size(); i++) { // Usando .size() para ArrayList
            System.out.print(vetorPar.get(i) + "\t");
        }

        // Exibindo os números ímpares
        System.out.println("\nVetor Ímpar:");
        for (int i = 0; i < vetorImpar.size(); i++) { // Usando .size() para ArrayList
            System.out.print(vetorImpar.get(i) + "\t");
        }
		
		
	}

}
