package bubbleSort;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//é bom pra pequenos conjuntos de dados. Pra grandes, é lerdo
		
		int[] vetor=new int[10];
		for (int i=0; i<vetor.length; i++) {
			vetor[i]=(int)(Math.random()*vetor.length);
			System.out.println("Posiçao "+i+" : "+vetor[i]); //Esta em
			//ordem aleatoria
		}
		
		
		//Calculando o tempo que leva: 
		long inicio=System.currentTimeMillis();
		long end=0; 
		//BUBBLE SORT: vai fixar numa posicao onde uma variavel vai 
		//marcar uma posicao fixa no zero e a outra vai andar testando
		//o resto dos valores pra saber se é maior ou menor pra ordenar
		
		for (int i=0; i<vetor.length; i++) { //I vai ficar parado pro
			//J testar os elementos comparando com o do I
			for (int j=i+1; j<vetor.length; j++) {//J começa em 1 porque
				//fica do lado do elemento apontado por I
				if (vetor[i] > vetor[j]) {
					int aux = 0; 
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux; 
				}
				
			}
			
		}
		
		end=System.currentTimeMillis();
		System.out.println("O tempo foi: "+(end-inicio));
		
		System.out.println("Imprimindo o vetor ordenado:");
		for (int i=0; i<vetor.length; i++) {
			System.out.println("Posiçao "+i+": "+vetor[i]);
		}
		System.out.println("Vetor ordenado! ");
		
		//O problema do bubble é que, pra cada posiçao de i, ele passa
		//pelo vetor inteiro de j. Pra passar pelo i, é complexidade de
		//O(n) e para passar pelo j, é de complexidade O(n-1), mas ignoramos
		//os numeros absolutos. Ou seja, a complexidade do algoritmo é de
		//O(n^2)

	}

}
