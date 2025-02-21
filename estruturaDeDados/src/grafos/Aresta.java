package grafos;

public class Aresta<TIPO> {
	//O que aresta tem? Tem Vértice de entrada e de saida + peso
	
	private double peso; 
	private Vertice<TIPO> verticeInicio;
	private Vertice<TIPO> verticeFinal;
	
	//Criando Getters e Setters:

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Vertice<TIPO> getVerticeInicio() {
		return verticeInicio;
	}

	public void setVerticeInicio(Vertice<TIPO> verticeInicio) {
		this.verticeInicio = verticeInicio;
	}

	public Vertice<TIPO> getVerticeFinal() {
		return verticeFinal;
	}

	public void setVerticeFinal(Vertice<TIPO> verticeFinal) {
		this.verticeFinal = verticeFinal;
	}
	
	//O construtor: 
	
	public Aresta(Double peso, Vertice<TIPO> inicio, Vertice<TIPO> fim) {
	    this.peso = peso;
	    this.verticeInicio = inicio;
	    this.verticeFinal = fim;
	}

}
