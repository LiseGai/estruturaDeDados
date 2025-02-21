package buscaLinear;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = new int[10];
		
		//Preenchendo o vetor: 
		for (int i = 0; i<8; i++) {
			//Vamos preencher com valores aleatorios de 0 a 10
			//convertendo pra inteiro
			vetor[i]= (int)(Math.random()*10);
			System.out.println("Posiçao "+i+": "+vetor[i]);
		}
		
		//Fazendo a busca linear: 
		System.out.println("Digite o valor a ser buscado: ");
		Scanner leitor = new Scanner(System.in);
		int buscado = leitor.nextInt();
		
		boolean encontrado=false;
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i]==buscado) {
				encontrado=true;
				break;
			} else {
				encontrado=false;
			}
		}
		if (encontrado) {
			System.out.println("Achou");
		} else {
			System.out.println("Nao encontrado");
		}
		
		

	}

}
