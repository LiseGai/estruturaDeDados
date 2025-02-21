package br.estruturadedados.filaencadeada;

//Classe que representa os elementos da minha fila que sao os Nos

public class No <TIPO> {
	
	private TIPO valor; 
	private No proximoNo; //Referencia pro proximo no 
	
	//Construtor: 
	public No(TIPO valor, No proximo) {
		// TODO Auto-generated constructor stub
		this.valor=valor; 
		this.proximoNo=proximo; //Recebe elemento que ta passando como parametro 
	}
	
	public TIPO getValor() {
		return valor;
	}
	public void setValor(TIPO valor) {
		this.valor = valor;
	}
	public No getProximoNo() {
		return proximoNo;
	}
	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}

}
