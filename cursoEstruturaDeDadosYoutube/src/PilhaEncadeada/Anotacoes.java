package PilhaEncadeada;

public @interface Anotacoes {
	
	/*
	 * Temos o cabeça que aponta pro primeiro elemento da estrutura
	 * Assim como em pilhas normais, se adiciona e remove os elementos do topo 
	 * 
	 * Inserindo: Se tamanho==0, cabeça=novoNo no caso de pilhas vazias, se nao tiver, 
	 * cabeça.getproximo()= null novoNo.setProximo(cabeça) isso significa que o novoNo vai apontar
	 * pro no cabeça que ta na posicao seguinte. Ou seja: 
	 * 
	 * if (tamanho==0){
	 * cabeça=novoNo; } else {
	 * novoNo.setProximo(cabeça)
	 * cabeça=novoNo 
	 * }
	 * tamanho++;
	 * 
	 * 
	 * o cabeça vai referenciar esse novo No
	 * 
	 * ---
	 * 
	 * Ja, na remoçao de dados, vai sair do topo e vai ser da seguinte forma:
	 * noRemovido = cabeça.getproximo()
	 * cabeça=cabeça.getproximo(); 
	 * noRemovido.setProximo(null);
	 * tamanho--;
	 */
	
	

}
