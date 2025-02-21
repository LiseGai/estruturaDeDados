package selectionSort;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vai pegar o primeiro elemento e vai comparar ele com todos os outros. Se algum outro
		//for o menor, troca de lugar com o primeiro e o I incrementa 1 pra passar pro proximo
		//Enquanto o I ta parado no primeiro, existe um J que ta andando (J começa em i+1). Vai
		//ter uma variavel auxiliar pra indicar, enquanto J percorre o vetor, onde ta o menor.
		//Ela, quando começa, ta junto com o I
		//J compara sempre, depois de ter achado alguém menor, com o valor armazenado na posiçao
		//do menor elemento
		//No final do vetor, o que troca é o elemento apontado por I com o elemento apontado pela
		//posiçao do menor
		//O selectionsort vai ter uma performance quadratica também, que também nao é bom (faz N
		//trocas, diferente do bubble que faz N^2. Por isso que é mais rapido que o bubble
		
		//1- Criando o vetor: 
		System.out.println("Vetor desordenado:");
		int[] vetor = new int[10];
		for (int i=0; i<vetor.length; i++) {
			vetor[i]=(int) (Math.random()*vetor.length);
			System.out.println("Posiçao "+i+": "+vetor[i]);
		}
		
		//2- SelectionSort: 
		int posicao_menor=0;
		for (int i=0; i<vetor.length;i++) {
			posicao_menor=i;
			for (int j=i+1; j<vetor.length; j++) {
				if (vetor[j]<vetor[posicao_menor]) {
					posicao_menor=j; //Nao vai fazer a troca, apenas deslocar a posicao do
					//menor elemento pro J caso ele seja menor. A troca vai ser feita quando
					//sair do for do J
				}
			}
			//Fazendo a troca
			int aux = 0; 
			aux=vetor[posicao_menor]; 
			vetor[posicao_menor]=vetor[i];
			vetor[i]=aux;
			//3- Imprimindo o vetor ordenado:
			System.out.println(vetor[i]);
			
		}

	}

}
