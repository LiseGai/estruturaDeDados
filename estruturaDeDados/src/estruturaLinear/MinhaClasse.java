package estruturaLinear;

import java.util.Scanner;

public class MinhaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3, i;
		System.out.println("Valor de x é: "+x);
		x=4;
		System.out.println("Novo valor de x é: "+x);
		int[] vetorzao = new int[10]; //Vetor + nome = new vetor [quantidade]
		for (i=0; i<vetorzao.length; i++) {
			vetorzao[i]=x;
			x++;
			System.out.println(vetorzao[i]);
		}
		
		System.out.println("----\nEstados:\n");
		String estados[] = new String[3];
		estados[0]="RS";
		estados[1]="SC";
		estados[2]="PR";
		for(i=0;i<estados.length;i++) {
			System.out.println(estados[i]);
		}
		
		System.out.println("----\nEntrada de valores: \n");
		Scanner valor = new Scanner(System.in);
		System.out.println("Qual estado quer buscar? ");
		String siglaBusca = valor.nextLine();
		
		//Busca linear:
		boolean encontrou = false; 
		int pos = 0;
		for (i=0; i<estados.length; i++) {
			if (siglaBusca.equals(estados[i])) {
				//System.out.println("O estado ocupa posiçao: "+ i);
				encontrou = true;
				pos = i;
				break;
			} 
		}
		if (encontrou) { //O mesmo que dizer encontrou == true
			System.out.println("O estado se encontra na posiçao "+i);
		}
		else {
			System.out.println("O estado nao foi encontrado");
		}
	}

}
