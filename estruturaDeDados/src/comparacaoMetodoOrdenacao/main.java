package comparacaoMetodoOrdenacao;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor = new int[10];
		System.out.println("Desordenado: ");
		for (int i=0; i<vetor.length; i++) {
			vetor[i]=(int) Math.floor(Math.random()*vetor.length);
			System.out.print(vetor[i]+ " ");
		}

	}

}
