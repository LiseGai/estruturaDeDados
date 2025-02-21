package estruturaLinear;

public class iteratorListaEncadeada<TIPO> {


	private Elemento<TIPO> elemento;
	
	//Ele guarda somente o elemento atual em que ele esta percorrendo
	//E nos permite saber se tem um proximo elemento
	
	//Criando o iterator em um parenteses à explicaçao, recebendo um
	//elemento do tipo TIPO
	public iteratorListaEncadeada (Elemento<TIPO> atual){
		this.elemento=atual;
	}
	
	public boolean temProximo() {
		if (elemento.getProximo()==null) {
			return false;
		} else { return true; }
	}
	
	//Entao se pega o proximo:
	public Elemento<TIPO> getProximo(){
		elemento=elemento.getProximo(); //senao vai ficar parado na lista
		return elemento;
	}
	
	//Pra pegar o iterator em uma lista, criaremos o metodo na listaEncadeada
	//chamado iteratorListaEncadeada

}
