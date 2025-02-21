package shellSort;

public class exercicioCartas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//15 cartas = N
		//H=13 (primeira varredura)
		//K=3
		
		System.out.println("Vetor desordenado:");
		int[] vetor = new int[15];
		for (int i=0; i<vetor.length; i++) {
			vetor[i]=(int)(Math.random()*vetor.length);
			System.out.println(vetor[i]);
		}
		
		int h=1, n=vetor.length;
		while (h<n) {
			h=h*3+1;
		}
		h=(int)(Math.floor(h/3));
		
		int elementoComparado, j; 
		while (h>0) {
			for (int i=h; i<n; i++) {
				elementoComparado=vetor[i]; //Vai ser o elemento comparado, considerar um aux
				j=i; 
				while (j>=h && vetor[j-h]>elementoComparado){
					vetor[j]=vetor[j-h];
					//Se o elemento comparado for menor que o elemento inicial da "faixa" de vetor analisada, 
					//entao, troca os dois
					
					j=j-h;//Passa o J pro elemento final dessa faixa na qual o vetor foi fatiado
				}
				vetor[j]=elementoComparado;
			}
			h=h/2; //Novo valor de H
		}
		System.out.println("Vetor ordenado: ");
		for (int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
