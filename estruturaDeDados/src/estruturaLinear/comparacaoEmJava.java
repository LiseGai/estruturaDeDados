package estruturaLinear;

import java.util.ArrayList;

public class comparacaoEmJava {
	public static void main(String[] args) {
		listaEncadeada<Integer> listacomparada = new listaEncadeada<Integer>();
		
		//Pra fazer uma comparaçao com vetor, se usa o ArrayList criando
		//um novo vetor que também é genérica:
		ArrayList <Integer> vetor = new ArrayList<Integer>();
		
		//Comparar a adiçao de elementos: 
		int limite=10000; 
		//1- Por tempo: 
		long tempoInicial=System.currentTimeMillis();
		long tempoFinal; 
		for(int i=0; i<limite; i++) {
			vetor.add(i);
		}
		tempoFinal=System.currentTimeMillis();
		System.out.println("Para vetor o tempo foi: "+(tempoFinal-tempoInicial));
		//Se forem poucos elementos, vai imprimir 0
		//Agora em lista por tempo: 
		 
		tempoInicial=System.currentTimeMillis();
		tempoFinal=0; 
		for(int i=0; i<limite; i++) {
			listacomparada.Adicionar(i);
		}
		tempoFinal=System.currentTimeMillis();
		System.out.println("Para lista o tempo foi: "+(tempoFinal-tempoInicial));
		//A diferença de tempo tem a ver com a quantidade de verificaçoes
		//com a lista que n acontece com o vetor, manipulando mais a 
		//memoria
		
		//2- Tempo pra Ler valores: 
		//Vetor: 
		tempoInicial=System.currentTimeMillis();
		tempoFinal=0;
		for(int i=0; i<vetor.size(); i++) {
			vetor.get(i);
		}
		tempoFinal=System.currentTimeMillis();
		System.out.println("O tempo de leitura de vetores é: "+(tempoFinal-tempoInicial));
		//Lista: 
		tempoInicial=System.currentTimeMillis();
		tempoFinal=0;
		for(int i=0; i<listacomparada.getTamanho(); i++) {
			listacomparada.get(i);
		}
		tempoFinal=System.currentTimeMillis();
		System.out.println("O tempo de leitura de lista é: "+(tempoFinal-tempoInicial));
		//A diferença acontece porque, para ler um elemento na lista, 
		//precisa ir: 1, 1 e 2, 1 2 e 3, 1 2 3 e 4 a cada proximo 
		//recomeça do começo 
		//Por isso, se cria um iterator 
		tempoInicial=System.currentTimeMillis();
		tempoFinal=0;
		iteratorListaEncadeada<Integer> iterator = listacomparada.getIterator();
		//é integer porque é lista de inteiros
		while(iterator.temProximo()) {
			//Enquanto o iterator tiver proximo, vai pegar o proximo:
			iterator.getProximo();
			//Imagine a variavel iterator, ela vai começar na primeira
			//bolinha. Tem proximo? Segue pra ele. Nao tem? Para. Isso
			//vai fazer com que ele nao volte pro começo a cada vez que siga pro 
			//proximo
		}
		tempoFinal=System.currentTimeMillis();
		System.out.println("O tempo de leitura de lista com Iterator é: "+(tempoFinal-tempoInicial));
		//Ou seja, a quantidade de passos que um algoritmo faz é direta-
		//mente ligada à sua performance
		
		//Processamento ta relacionado ao tempo e espaço de memoria (disco
		//ou memoria em si) à quantidade de disco que precisaria. Tudo 
		//isso deixa o algoritmo mais performatico. A complexidade de
		//um algoritmo quer saber o quao rapido e se vai continuar sendo
		//rapido na medida que os dados aumentarem. Como o tempo nao é
		//fixo a cada rodagem do algoritmo, pra analisar qual é melhor
		//se criou a complexidade. Mas, no melhor caso de um vetor de uma busca linear
		//vai se testar uma posiçao se o valor estiver no primeiro espaço
		//e o pior caso no ultimo, mas o caso médio é o meio do vetor
		//Se lida com a complexidade de algoritmo sempre considerando o
		//pior caso, porque é nele que vamos pensar se temos que aumentar
		//a memoria da maquina, por exemplo. O pior caso é sempre represen-
		//tado por O() (letra O). Ela é chamada Notaçao O ou BIG O. 
		
		//A Big O tem algumas classes. Imaginemos no grafico que o eixo
		//x é o tamanho do nosso problema (vulgo, tamanho do vetor). Um
		//algoritmo com 50 elementos, vai levar 50 passos e assim vai. Na
		//medida que o tamanho do vetor aumenta, a quantidade de passos aumenta de
		//forma linear (proporcional). Ou seja, a notaçao pra representar
		//a complexidade vai ser O(n), onde n é o tamanho do problema(vetor)
		//onde a complexidade é uma funçao linear. O(n), no entanto, nao
		//é bom, porque, na medida que n aumenta, o tempo (eixo y) também
		//aumenta e queremos o maior problema com menor tempo. O melhor
		//tipo de algoritmo é O(log n). Essa notaçao, entao, mede a 
		//quantidade de passos. Maior complexidade = mais tempo de exe-
		//cuçao. 
		
		//Como, quanto maior o tamanho do vetor, maior a quantidade
		//de passos em uma busca linear, ela é considerada uma busca
		//lenta. A binaria é mais rapida que a linear. Mas a busca binaria
		//tem um conceito importante: o vetor precisa estar ordenado
		//Se tiver desordenado, é impossivel, porque o conceito da 
		//busca binaria é dividir o vetor em 2 partindo do começo e do
		//fim do vetor. O numero central do vetor vai ser perguntado
		//se é menor ou maior que o buscado. Se for maior, ta na
		//primeira metade. Se for menor, ta na segunda metade do vetor
		//Por isso a necessidade de estar ordenado. Entao, se divide
		//a metade do vetor onde o buscado se encontra pela metade de novo
		//apos passar o começo do vetor pro primeiro elemento da metade
		//e se faz mais uma vez a pergunta pra saber se o buscado é 
		//maior ou menor que o novo valor central. Na busca binaria, o
		//melhor caso é o meio do vetor e o pior um numero que nao existe
		
		//Na busca binaria, o aumento é logaritmico com uma complexidade
		//O(logN), ou seja, é a melhor complexidade possivel dentro de
		//um algoritmo dentre as possiveis (a pior seria N!)
	}
}
