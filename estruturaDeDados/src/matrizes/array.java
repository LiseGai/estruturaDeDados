package matrizes;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vetor = new String[5];
		vetor[0]="Joao";
		vetor[1]="Maria";
		vetor[2]="José";
		vetor[3]="Ana";
		vetor[4]="Lucia";
		
		String[] vetor2=new String[4];
		System.out.println("Entre com os valores do vetor 2: ");
		for (int i=0; i<vetor2.length; i++) {
			vetor2[i]=new Scanner(System.in).nextLine();
		}
		
		System.out.println("Vetor 1: ");
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Posiçao "+i+": "+vetor[i]);
		}
		
		System.out.println("Vetor 2: ");
		for(int i=0; i<vetor2.length; i++) {
			System.out.println("Posiçao "+i+": "+vetor2[i]);
		}
		

	}

}
