package adicionandoElementoStringFinalVetor;

public class Vetor {
	private String[] elementos;
	
	public Vetor (int capacidade) {
		this.elementos= new String[capacidade];
	}
	public void adiciona(String elemento) {
		//Pra saber se podemos adicionar elementos, é verificar quais elementos sao nulos:
		for (int i=0; i<this.elementos.length; i++) {
			if (this.elementos[i]==null) {
				this.elementos[i]=elemento;
				break; //Para na primeira posiçao nula
			}
		}
	}

}
