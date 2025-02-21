package grafos;

import java.util.ArrayList;

public class Vertice<TIPO> {
	
	//O que um vértice tem? Dado e lista de arestas de entrada e de saida:
	private TIPO dado; 
	private ArrayList<Aresta <TIPO>> arestasEntrada; //é uma lista de aresta de tipo 
	private ArrayList<Aresta <TIPO>> arestasSaida;
	
	public Vertice(TIPO valor) {
		//Inicializando o dado contido no vértice
		this.dado=valor;
		
		//Inicializando as arestas: 
		this.arestasEntrada=new ArrayList<Aresta <TIPO>>();
		this.arestasSaida=new ArrayList<Aresta <TIPO>>();
	}
	
	//Como é privado, fazer o getter e setter: 

	public TIPO getDado() {
		return dado;
	}

	public void setDado(TIPO dado) {
		this.dado = dado;
	}
	
	//Cada vértice precisa adicionar arestas de entrada e saida:
	
	public void adicionarArestasEntrada(Aresta<TIPO> aresta) {
		this.arestasEntrada.add(aresta);
		//Ta dando erro em Aresta<TIPO> porque ainda nao fizemos nada na classe Aresta
	}
	
	public void adicionarArestasSaida(Aresta<TIPO> aresta) {
		this.arestasSaida.add(aresta);
	}

	public ArrayList<Aresta<TIPO>> getArestasEntrada() {
		return arestasEntrada;
	}

	public void setArestasEntrada(ArrayList<Aresta<TIPO>> arestasEntrada) {
		this.arestasEntrada = arestasEntrada;
	}

	public ArrayList<Aresta<TIPO>> getArestasSaida() {
		return arestasSaida;
	}

	public void setArestasSaida(ArrayList<Aresta<TIPO>> arestasSaida) {
		this.arestasSaida = arestasSaida;
	}
	

}
