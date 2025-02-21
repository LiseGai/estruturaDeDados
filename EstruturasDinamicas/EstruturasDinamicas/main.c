//
//  main.c
//  EstruturasDinamicas
//
//  Created by Lise on 20/02/25.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    // O que torna uma estrutura dinamica? A capacidade de manipular o tamanho de uma
    //estrutura. As mais conhecidas sao Listas, Pilhas, Filas, Deques e arvores. Cada uma
    //delas tem uma finalidade especifica, por isso, é importante conhecer o maximo
    //possivel para escolher a mais adequada.
    
    //No caso da pilha, se coloca no topo e retira do topo, sendo basicamente um vetor
    //com essa especificaçao. Na pilha se faz apenas duas operaçoes: Empilhar (push ou desempilhar (pop). Podemos manipular a pilha pelo meio, mas, se precisarmos fazer isso, muito provavelmente estamos usando a estrutura de dados errada e seria melhor usarmos uma lista encadeada, por exemplo
    
    //Pilhas usam sempre ponteiros, entao sempre teremos um apontando para o topo da nossa lista. No começo, como a pilha ta vazia, o valor desse ponteiro é nulo. Mas ele vai descendo junto com o primeiro elemento colocado. Esse ponteiro é do tipo noh.
    
    //Quando inserimos um novo elemento, cada elemento vai ter um ponteiro apontando para o elemento debaixo. Como se a constituiçao do elemento fosse: Dado + Ponteiro (aponta para o proximo). Por isso que o ponteiro do mais baixo elemento vai sempre apontar pra null
    
    //Para retirar o elemento do topo, precisa de um novo ponteiro que vai apontar pra esse elemento do topo. O segundo passo é que a variavel *topo que existia antes, agora vai apontar para o novo elemento topo (o que estava abaixo dele) e por fim se da um free(remover) liberando o primeiro elemento.
    
    /*
     A estrutura de um no pode ser representada da seguinte forma:
     typedef struct no {
        int dado;
        struct no *proximo;
     }No;
     */
    return 0;
}
