package grafos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Anotaçoes sobre Grafos: 
		 * 
		 * Grafos é tudo o que contém vértices e arestas (toda lista ligada e arvores é um grafo)
		 * Vértices = bolas = Nos 
		 * Arestas = ligaçoes entre as bolas 
		 * 
		 * A lista Encadeada é um grafo direcionado 
		 * A arvore binaria é um grafo nao direcionado com uma regra de que, cada elemento, tem no
		 * maximo dois filhos. Ou seja, cada elemento ta ligado a no maximo 3 elementos (seus 2 
		 * filhos e seu pai)
		 * 
		 * Nos grafos, a quantidade de ligaçoes entre os nos nao existem limites ou ordens
		 * Existem os grafos direcionados onde as arestas possuem uma direçao mostrando o sentido
		 * da ligaçao (podem ter arestas tanto indo quanto voltando ou os 2, entre 2 nos). 
		 * E também existem os grafos onde as arestas nao possuem direçao (grafos nao direcionados)
		 * 
		 * Sobre o peso das arestas, podemos tem um grafo pesado ou nao (cada aresta pode ter um 
		 * peso, um rotulo, uma informaçao). Mas, quando se coloca com numeros, é o peso da aresta
		 * que é o peso da relaçao entre os 2 vértices
		 * 
		 * Um exemplo de uso de grafos é para modelar as ruas de qualquer cidade (um exemplo disso
		 * é para o uso e criaçao de GPS onde precisa mostrar a mao da rua e o "peso" dela em, por
		 * exemplo, a quantidade de carros. "Se quer um caminho menos movimentado, pegam pesos me-
		 * nores")
		 * 
		 * Também é possivel usar grafo pra modelar as fronteiras de paises. Mas o mais claro é o
		 * social graph que o facebook trouxe pra modelar as amizades das pessoas e conseguir 
		 * indicar uma pessoa pra voce (Se Maria e Juca tem um peso forte nas arestas sobre suas 
		 * interaçoes, por exemplo, recomendar perfis que o Juca também tem um peso forte seria
		 * uma boa)
		 */
		
		//Pra começar, vamos criar a classe Grafo, Vértice e Aresta. Entao, vamos criar os grafos:
		Grafo<String> grafo = new Grafo<String>();
		//adicionando um vértice ao grafo:
		grafo.adicionarVertice("Joao");
		grafo.adicionarVertice("Lorenzo");
		grafo.adicionarVertice("Creuza");
		grafo.adicionarVertice("Créber");
		grafo.adicionarVertice("Craudio");
		
		//Fazendo as ligaçoes entre os vértices:
		grafo.adicionarAresta(2.0, "Joao", "Lorenzo");//dados double é 2.0
		grafo.adicionarAresta(3.0, "Lorenzo", "Créber");
		grafo.adicionarAresta(1.0, "Créber", "Creuza");
		grafo.adicionarAresta(1.0, "Joao", "Creuza");
		grafo.adicionarAresta(2.0, "Craudio", "Lorenzo");
		grafo.adicionarAresta(3.0, "Craudio", "Joao");
		
		/*
		 * Como podemos percorrer um grafo e imprirmir os elementos dele na tela? 
		 * 
		 * O grafo, ao contrario de uma arvore que tem raiz e lista que tem um primeiro, nao tem
		 * começo nem final. No grafo, se pode começar de qualquer lugar que existam arestas de
		 * saida do vértice
		 * Existem varios métodos para percorrer um grafo, dois deles é a busca em profundidade
		 * e a busca em largura. 
		 * 
		 * Busca por profundidade: Sai de um vértice e vai seguindo as arestas de saida até nao 
		 * ter mais ninguém com formas de saida. Entao, começa a voltar, procurando arestas de
		 * saida ainda nao aprofundadas. 
		 * 
		 * Busca em largura: Exemplo, craudio visita Joao e Lorenzo. nao tem mais ninguém pra
		 * ser visitado? Vai pra quem foi visitado primeiro, ou seja, Joao. 
		 * 
		 * Os 2 possuem formas diferentes de percorrer o grafo 
		 * 
		 * Vamos começar implementando a busca em largura dentro do grafo
		 */
		
		//Vamos imprimir a busca em largura:
		grafo.buscaEmLargura();
	}

}
