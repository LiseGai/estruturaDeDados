package shellSort;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Começa pegando de 4 em 4 pra verificar a ordenaçao entre o primeiro e o quarto, o quarto e o oitavo e etc.
		//Entao, pega de 2 em 2 para fazer a mesma verificaçao, partindo do primeiro (primeiro e terceiro) 
		//Por fim, pra garantir que todo vetor vai ficar ordenado, ele passa de um em um (ultima iteraçao) 
		//funcionando como insertionSort 
		//Essa comparaçao vai ser feita, no caso de h=4, do 0 com o 5, 1 com o 6, 2 com o 7 e etc.
		//E, a cada troca feita, ele volta pra comparar com o anterior (volta 1 passo)
		
		//Para h=4 vamos ter 4 sublistas (0 a 5, 1 a 6, 2 a 7, 3 a 8) e se a distancia H for 1, 
		//vai ter uma unica lista 
		
		//A formula de Donald Ervin pra determinar H era: H=((3^K)-1)/2 onde K é o numero de 
		//varreduras
		//A distancia de uma varredura até a seguinte é sempre o triplo da seguinte +1
		
		//Para determinar H, vamos considerar que a primeira varredura vai ser metade da lista
		//(N/2), ou seja: 
		//(N/2) = ((3^k)-1)/2
		//N+1=3^K
		//Log(b:3)(N+1)=Log(b:3)(3^k)
		//K=Log(b:3)(N+1)=(Log(N+1))/(Log (3))
		//Isso, em linguagem C é escrito como: float K=log(tamanho+1)/log(3)
		

		System.out.println("Vetor desordenado: ");
		int[] vetor = new int[10];
		for (int i=0; i<vetor.length; i++) {
			vetor[i]=(int)(Math.random()*vetor.length);
			System.out.println("Posiçao "+i+": "+vetor[i]);
		}
		
		//O shell começa com uma variavel inteira igual a 1
		int h=1;
		//E uma variavel N guardando o tamanho do vetor:
		int n=vetor.length;
		//Vai encontrar entao qual a quantidade de pulos que vai dar: 
		while (h<n) {
			
			h=h*3+1; //Regra definida pelo Shell
		}
		//Quando sair do while, vamos arredondar pra baixo pegando apenas a parte inteira:
		h=(int)(Math.floor(h/3)); //Vai dar o tamanho do primeiro pulo
		
		//Vamos começar a fazer um insertionSort, mas pulando valores
		int c,j;
		//Enquanto o tamanho do pulo for maior que zero, continua pulando posiçoes:
		while (h>0) {
			for (int i=h; i<n; i++) {
				c=vetor[i];//C vai marcar qual elemento do vetor que quero fazer a troca, que quero verificar
				j=i; //J vai passar pelas posiçoes puladas verificando onde o elemento C se 
				//encaixaria melhor
				
				//Pra o vetor pular, difere do insertion:
				while(j>=h && vetor[j-h]>c) {
					vetor[j]=vetor[j-h]; //Enquanto o vetor[j](que é o valor que ta sendo pulado)
					//for maior que o elemento que eu quero trocar, vamos trocar os 2
					j=j-h;
				}
				vetor[j]=c;
			}
			h=h/2; //Vai passar pra um H que vai de 2 em 2
			//No final do while, ele vai fazer o de 1 em 1
		}
		System.out.println("\n\nVetor Ordenado: ");
		for (int i=0; i<vetor.length; i++) {
			System.out.println("Posiçao "+i+": "+vetor[i]);
		}

	}

}
