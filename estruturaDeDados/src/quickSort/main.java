package quickSort;

public class main {
	public static void main(String[] args) {
		/**
		 * Ele é rapido porque divide o vetor em problemas menores colocando um pivo como 
		 * elemento do meio do vetor onde todos elementos menores que o pivo ficam à esquerda
		 * e maiores à direita dele
		 * 
		 * Nos 2 vetores que restaram, vamos pegar mais um pivo em cada um
		 * 
		 * Isso vai ser feito recursivamente 
		 * 
		 * O pior caso do quick é o vetor estar ordenado decrescentemente (complexidade
		 * quadratica) e no caso médio, ele
		 * tem Big O no caso nlog(n) que nao é quadratica (nao vai passar pelo vetor inteiro 
		 * a cada n passadas que der). Nessas N passadas, vai dividir o vetor de 2 em 2 até 
		 * que nao consiga mais dividi-lo. E isso vai dar uma complexidade logaritmica
		 */
		int[] vetor = new int[10];
		System.out.println("Desordenado: ");
		for (int i=0; i<vetor.length; i++) {
			vetor[i]=(int) Math.floor((Math.random()*vetor.length));
			System.out.print(vetor[i]+" ");
		}
		
		quickSort(vetor, 0, vetor.length-1); //Diminui o tamanho do vetor em 1
		
		System.out.println("\nOrdenado: \n");
		for (int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
	}
	
	static void quickSort(int[] vetor, int esquerda, int direita) { 
		//Esquerda e direita sao a menor e maior posiçao desse pedaço de vetor que quero
		//ordenar
		
		//Se a esquerda for menor que a direita, precisa fazer verificaçao pra que o 
		//algoritmo pare em algum momento:
		if (esquerda < direita) {
			//Quando o pivo da esquerda andando pra direita e o da direita andando pra 
			//esquerda se cruzarem, significa que ja ordenei meu vetor
			
			int p=particao(vetor, esquerda,direita); //P é o pivo que chama o método particao 
			//que é um pedaço do vetor que vai da esquerda até a direita
			
			quickSort(vetor, esquerda, p);
			quickSort(vetor, p+1, direita);
		}
		
	}
	
	static int particao(int[] vetor, int esquerda, int direita) {
		//A cada parte de vetor, o pivo vai ser sempre o elemento do meio
		int pivot = vetor[(int)(esquerda+direita)/2]; //Garante que esteja no meio pegando apenas
		//a parte inteira da divisao
		
		int i=esquerda-1; 
		int j=direita+1;
		
		//Vamos fazer um while infinito
		while(true) {
			do {
				i++;
			} while(vetor[i]<pivot); //Isso significa que o I vai andando pra direita enquanto 
			//o vetor na posiçao I for menor que o valor do elemento do pivot. E o j vai fazer
			//o caminho contrario:
			do {
				j--;
			} while (vetor[j]>pivot);
			
			if (i>=j) {
				//Significa que se encontraram:
				return j; //A posiçao que tenho que fazer a troca
			}
			int aux = vetor[i];
			vetor[i]=vetor[j];
			vetor[j]=aux;
		}
	}
}
