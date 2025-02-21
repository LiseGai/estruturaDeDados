package estruturaLinear;

public class listaEncadeada<TIPO> {
	//O <tipo> é pra poder usar o generics do java que vai permitir
	//que se misture string com int e etc. Entao, no main, a lista
	//vai vir com <String>, <Cliente>, <Integer> pra definir o tipo
	//Isso significa que vamos ter que passar de volta, pro Elemento
	//O <TIPO> em Elemento.Java. O genérico se chama TIPO
	private Elemento<TIPO> primeiro; 
	private Elemento<TIPO> ultimo;
	private int tamanholista;
	
	//Mètodo construtor do cadastroEstados:
	public listaEncadeada() {
		this.tamanholista=0;
	}
	
	
	public Elemento<TIPO> getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Elemento<TIPO> primeiro) {
		this.primeiro = primeiro;
	}
	public Elemento<TIPO> getUltimo() {
		return ultimo;
	}
	public void setUltimo(Elemento<TIPO> ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanholista;
	}
	public void setTamanho(int tamanho) {
		this.tamanholista = tamanho;
	}
	
	//Como ta privado, gerar getters setters 
	//O preceito de listas ligadas é similar ao de um vetor, mas 
	//com a capacidade de manipular o seu tamanho com menor custo 
	//computacional. Ela permite remover e pegar alguns elementos também
	//Cada elemento conhece apenas o seu posterior
	
	//Criar programa de cadastro de estados
	
	//Método adicionar elementos: 
	public void Adicionar(TIPO novoValor) {
		Elemento <TIPO>novoElemento = new Elemento<TIPO>(novoValor); //Isso cria um novo
		//"Espaço" na lista para ser preenchido, que vai alterar no
		//tamanho
		//O "novoValor" é pela variavel que recebeu o valor em cadastro
		//E no método elemento precisa do construtor que receba esse
		//valor gerado 
		//A lista so controla "bolinhas", o elemento que vai receber
		//o valor e o valor so é 
		
		//Se o primeiro e o ultimo elementos forem null
		//vamos dizer que o primeiro é o novoElemento e o ultimo é 
		//o novoElemento que recebem o novoValor
		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = novoElemento; 
			this.ultimo = novoElemento;
			//Aumenta 1 em tamanho:
			this.tamanholista++;
			//Se usa o this. pra dizer que é um elemento da classe 
			//lista Encadeada
		}
		//Quando o primeiro e o ultimo n sao nulos, temos que adicionar
		//o novo elemento:
		else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo=novoElemento;
			this.tamanholista++;
		}
	}
	
	//Método remover elementos: 
	public void Remover (TIPO valorProcurado) {
		//Primeiro, se pega o primeiro elemento com a variavel atual
		//e essa atual vai andando na lista a medida que se tem um 
		//proximo elemento
		Elemento<TIPO> atual = this.primeiro;
		
		//Para pegar o anterior, devemos considerar que começa como 
		//null, porque o anterior do primeiro elemento é null: 
		Elemento<TIPO> anterior = null;
		//Junto com o atual, a variavel anterior vai começar a andar 
		//também 
		for (int i=0; i<this.getTamanho(); i++) {
			
			//if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
			//equalsIgnoreCase apenas string
			if (atual.getValor().equals(valorProcurado)) {
				//Se o atual é primeiro e ultimo 
				if (atual==primeiro && atual == ultimo) { // Ou this.tamanho == 1
					this.primeiro = null;
					this.ultimo = null;
				}
				
				//Vamos testar se o elemento encontrado é o primeiro
				//ou o ultimo porque ta dando bug:
				else if (atual == primeiro) {
					this.primeiro = atual.getProximo();
					atual.setProximo(null); //retira a flecha do atual
				}
				else if (atual == ultimo) {
					this.ultimo = anterior;
					anterior.setProximo(null);
				}
				else {
				//Quando for igual ao elemento que vai ser removido(
				//valorProcurado), vamos fazer o anterior ter como 
				//proximo o proximo do atual: 
				anterior.setProximo(atual.getProximo());
				//Com isso, a remoçao do atual é feita e se encerra
				//a busca: 
				atual = null; 
				}

				//Ajeitando o tamanho da lista: 
				this.tamanholista--;
				break; 
			}
			//Antes do atual pegar o proximo, devemos considerar que
			//o anterior seja o atual, porque ele vai andar junto
			anterior = atual;
			//O i vai andar junto com o atual nesse caso
			atual=atual.getProximo();
			
		}
		
	}
	
	//Método para pegar um elemento: 
	public Elemento get(int posicao) { //get(posicao que quer)
		Elemento atual = this.primeiro; //Vai marcar em qual elemento ta
		//Começa sempre pelo primeiro
		
		//Começa a percorrer a lista:
		for(int i=0; i<posicao; i++) {
			//O i controla os numeros como em um vetor e o atual vai 
			//de bola em bola da lista encadeada 
			
			//Verificar se o atual tem proximo: 
			if (atual.getProximo() != null) {
				//Atual vai ser o proximo: 
				atual = atual.getProximo();
				//Se o atual tem proximo, o proximo vira o atual (
				//atual anda pra bola da frente) e o i incrementa
				//pra refazer a pergunta: Atual tem proximo?
			}
		}
		return atual;
		
		//return null; //Precisa do return por ser do tipo elemento e n void
		
	}
	
	//Iterator:
	public iteratorListaEncadeada<TIPO> getIterator(){
		//Ele retorna um novo iterator da classe lista, passando pra
		//ele o primeiro elemento da lista
		return new iteratorListaEncadeada<TIPO>(this.primeiro);
		//Deu erro porque nao temos o método construtor no iterator,
		//precisa criar
	}
	
	//Tem a ver com pilha: 
    public void adicionarComeco(TIPO novoValor) {
        Elemento<TIPO> novoElemento = new Elemento<>(novoValor);

        if (this.primeiro == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            novoElemento.setProximo(this.primeiro);
            this.primeiro = novoElemento;
        }
        this.tamanholista++;
    }
}
