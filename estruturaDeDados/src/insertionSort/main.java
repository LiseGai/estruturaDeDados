package insertionSort;

public class main {
	public main() {
		// TODO Auto-generated constructor stub
		//Um pouco mais rapido que o bubble sort, mas também é de complexidade
		//quadratica. A partir de um novo valor que vai ser inserido
		//em um conjunto de dados, vamos comparar do final pro começo
		//e vamos inserir o valor no lugar exato para que o conjunto
		//se mantenha ordenado. 
		
		//O algoritmo começa com um vetor de tamanho 1 e vai aumentando
		//de 1 em 1. Entao, pega o elemento final e vai comparando com
		//seus anteriores (do final pro inicial) pra saber onde colocar
		//e, assim, vai ordenando os elementos. O ultimo elemento do
		//vetor é apontando por J (e mandando pro aux) e o primeiro por I
		//O J-1 vai começar a apontar os elementos pra comparar
		
		
		//O pior caso é quando o vetor ta invertido e ordenado, pois
		//tem o maximo de trocas que vai ser. Ele é de complexidade
		//quadratica porque o I varre N vezes o vetor e o J varre N 
		//também. 
		
		//1- Preenchendo o vetor de forma aleatoria
		int[] vetor = new int[10];
		for(int i=0; i<vetor.length; i++) {
			vetor[i]=(int)(Math.random()*vetor.length);
			System.out.println("Posiçao "+i+" :"+vetor[i]);
		}
		
		//2- Insertion Sort com i começando em 1 porque em vetor de 
		//tamanho 1 nao precisa comparar nada
		int aux=0, j;
		for (int i=1; i<vetor.length; i++) {
			aux=vetor[i];
			j=i-1;
			while (j>=0 && vetor[j]>aux) {
				vetor[j+1]=vetor[j];
				j--;
			}
			vetor[j+1]=aux;
		}
		
		//Imprimindo o vetor: 
		System.out.println("Novo vetor: ");
		for (int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
