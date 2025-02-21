package matrizes;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] matriz = new String[2][3];
		
		System.out.println("Entre com os valores da matriz: ");
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {
				matriz[i][j]=new Scanner(System.in).nextLine();
			}
		}
		
		System.out.println("Valores da matriz: ");
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {
				System.out.println("Matriz["+i+"]["+j+"]: "+matriz[i][j]);
			}
		}

	}

}
