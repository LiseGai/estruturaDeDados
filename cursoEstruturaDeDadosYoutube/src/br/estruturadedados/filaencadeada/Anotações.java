package br.estruturadedados.filaencadeada;

public @interface Anotações {
	
	/*
	 * Utiliza a alocaçao dinamica de memorias. Ou seja, vai usando a alocaçao conforme
	 * a necessidade do programa e liberando ao excluir também, tornando o processamento
	 * muito mais eficiente 
	 * Desvantagem: Sempre que for adicionar um valor, primeiro se aloca a regiao e depois
	 * se coloca o valor 
	 * 
	 * Cada dado é um no. Cada no tem 2 "espaços". Um pra o valor e o outro como se fosse
	 * um ponteiro pro proximo elemento (referencia pro elemento seguinte). Se for o ultimo
	 * elemento, essa referencia vai apontar pra null. 
	 * 
	 * Quando queremos inserir um elemento, onde tinha o valor null, vamos colocar o valor do elemento
	 * e o ponteiro do novo valor vai apontar pra null. 
	 * 
	 * Se chama encadeada porque, a partir do no cabeça (o primeiro), se faz o encadeamento 
	 * dos proximos elementos, podendo navegar por todos eles
	 * 
	 * Quando se "exclui" um elemento, na verdade, apenas se deixa o elemento deslocado, 
	 * sem qualquer ligaçao com o restante da fila. Bastante semelhante com o que acontece 
	 * quando se "desativa" uma classe em banco de dados onde nao se exclui de fato ela, apenas
	 * se retira as ligaçoes a fim de nao perder informaçoes 
	 * 
	 * Pra alocar uma memoria no java, se faz, por exemplo: No no10 = new No();
	 * Ou seja, basicamente, se estancia o objeto
	 */

}
