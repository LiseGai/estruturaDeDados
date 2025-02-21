package heapSort;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Passa por todo vetor tentando selecionar o maior, sempre se perguntando qual o 
		 * proximo maior para que possa jogar eles para o final do vetor
		 * 
		 * O heap é um tipo especifico de arvore binaria (raiz em cima e os ramos pra baixo)
		 * Cada elemento tem 2 filhos. Ou seja, a raiz tem 2 filhos, cada filho tem 2 filhos e
		 * assim vai (N^2)
		 * Se for uma arvore binaria completa, significa que todos elementos tem 2 filhos até
		 * que chegue nos elementos mais baixos da arvore que sao os do tipo folhas 
		 * Se for ordenada, significa que pra esquerda temos os elementos menores que os da
		 * raiz e pra direita os maiores (considerar sempre as raizes do seguimento)
		 * 
		 * No Heap, é uma arvore ordenada onde o primeiro elemento é o maior de todos (elemento
		 * pai é maior que os seus filhos, mas vai considerando triangulos isolados da arvore
		 * pra analisar) 
		 * Vai pegar o vetor inteiro, pega o maior de todos e joga pra direita. Depois, diminui
		 * em 1 o tamanho do vetor, pega o maior elemento desses que sobraram e jogam pra direita
		 * e assim vai 
		 * 
		 * Pra descobrir os filhos, vamos sempre pegar a posiçao i e vai ter 2 filhos, usando
		 * a regra: 2i+1 (filho à esquerda) e 2i+2 (filho à direita). E isso vale pra todos os is
		 * do vetor, sem pular nenhum
		 */
		
		int[] vetor = new int [10];
		System.out.println("Vetor desordenado: ");
		for (int i=0; i<vetor.length; i++) {
			vetor[i]=(int)(Math.random()*vetor.length);
			System.out.println(vetor[i]);
		}
		
		//HEAP SORT: 
		int n = vetor.length;
		for (int i=(n/2)-1; i>=0; i--) {   //Da regra 2i+1
			aplicarHeap(vetor, n, i); //Chama o método aplicar heap no vetor considerando tamanho e posiçao I
		}
		
		System.out.println("Quase Ordenado: ");
		for (int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		//Vamos diminuir o tamanho do vetor 1 a 1, porque as raizes ja sao os maiores 
		//elementos e agora vamos pegar o maior elemento e jogar pro fim 
		for (int i=n-1; i>0; i--) {
			int aux = vetor[0]; //é o maior de todos, porque a raiz vai tar sempre no começo
			vetor[0]=vetor[i];
			vetor[i]=aux;
			
			aplicarHeap(vetor, i, 0); //Toda vez que faz uma troca, chama a funçao
		}
		
		System.out.println("Ordenado: ");
		for (int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
	
	private static void aplicarHeap(int[] vetor, int n, int i) {
		int raiz = i; 
		int esquerda = (2*i)+1;
		int direita = (2*i)+2;
		
		//Verificar se a posiçao esquerda ta pra fora do vetor e se o elemento no vetor da esquerda
		//for maior que o elemento do vetor na posiçao raiz, vai trocar esquerda com a raiz
		if (esquerda < n && vetor[esquerda]>vetor[raiz]) {
			raiz = esquerda; //a posiçao da nova raiz é a esquerda
		}
		if (direita < n && vetor[direita]>vetor[raiz]) {
			raiz = direita; 
		}
		
		//Verificar se entrou em uma das condiçoes acima, porque a raiz começou sendo I: 
		if (raiz != i) {
			int aux = vetor[i];
			vetor[i]= vetor[raiz];
			vetor[raiz] = aux;
			
			//Fazemos essa troca ser recursiva: 
			aplicarHeap (vetor, n, raiz);
		}
	}

}
