package recursividade;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = new int[5];
		
		//Preenchendo o vetor
		for (int i=0; i<vetor.length; i++) {
			vetor[i]=(int)(Math.random()*vetor.length);
			System.out.println("Posicao "+i+" :"+vetor[i]);
		}
		
		//Recursividade é um codigo que chame ele mesmo. Pra isso, criamos um método chamado
		//somar e passamos o vetor como parametro:
		somar(0, 0, vetor); //Começa a somar a partir da posicao 0

	}
	
	private static int somar(int soma, int posicao, int[] vetor) {
		if(posicao < vetor.length) {
			soma = soma + vetor[posicao];
			return somar(soma, posicao + 1, vetor);
		
		//A recursividade é o somar chamar o proprio somar no return pra resolver, por exemplo,
		//a soma do vetor
		//Pra evitar o loop infinito, precisa de um ponto de parada
		/*
		 * Vai ficar: 
		 * somar(0, vetor)
		 * somar(1, vetor)
		 * somar(2, vetor)
		 * somar (3, vetor)
		 * somar(4, vetor)
		 * somar (5, vetor)
		 * até chegar na posicao final (explicaçao no if daqui)
		 * Mas, como nao sabe quanto deu a soma anterior, se passa a variavel soma junto
		 */
		} else {
			System.out.println("A soma é: "+soma);
			return soma; //Vai retornar o valor final da soma
		}
	}

}
