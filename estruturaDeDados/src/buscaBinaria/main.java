package buscaBinaria;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = new int[8];
		
		for (int i=0; i<vetor.length; i++) {
			vetor[i]=i*2;
			System.out.println("Posiçao "+i+" :"+vetor[i]);
		}
		
		System.out.println("Qual numero deseja buscar? ");
		Scanner numero = new Scanner(System.in);
		int buscado = numero.nextInt();
		boolean achou = false; 
		
		//Pra cada numero buscado, vamos descobrir quantos testes ele faz
		int cont = 0;
		
		//Vamos começar a divisao do vetor: 
		int inicio=0; 
		int fim=vetor.length-1; 
		int meio;
		//Enquanto o inicio tiver na esquerda e o fim na direita, vamos
		//fazer a busca binaria: 
		while(inicio <= fim) {
			//Calculando o meio, pegando apenas a parte inteira:
			meio= (int) ((inicio+fim)/2);
			
			cont++;
			
			//Vetor na posicao meio é igual ao buscado? 
			if(vetor[meio]==buscado) {
				achou=true;
				break;
			} else if (vetor[meio]<buscado) {
				inicio=meio+1;
			} else { //maior do que o buscado
				fim=meio-1;
			} 
			
		}
		
		System.out.println("Quantidade de testes: "+cont);
		if (achou==true) {
			System.out.println("Encontrado");
		} else {
			System.out.println("Nao encontrado");
		}

	}

}
