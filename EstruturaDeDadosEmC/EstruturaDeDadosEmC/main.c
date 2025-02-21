//
//  main.c
//  EstruturaDeDadosEmC
//
//  Created by Lise on 19/02/25.
//

#include <stdio.h>
#include <stdlib.h>

int main(int argc, const char * argv[]) {
    // Estrutura de dados homogenea = do mesmo tipo
    int idade;
    char genero_nascimento;
    float nota;
    int num1[10];
    int num2[] = {1, 5, 9, 10, 15, 20};
    //Vetor com tamanho predefinido mas nao todos elementos dados:
    int num3[5]={1, 2, 3}; //Nesse caso, vai interpretar esses valores como os primeiros
    //do vetor e o restante ele vai preencher com zeros
    
    char letras[100];
    char vogais[5]={'A', 'E', 'I', 'O', 'U'};
    float notas[3]={2.3, 9.4, 10.0};
    
    int v1[4];
    
    //Imprimindo esses valores:
    printf("%d\n",num2[0]);
    printf("%c\n",vogais[2]);
    
    for (int i=0; i<5; i++)
        printf("%d\t", num2[i]);
    
    printf("Digite os numeros: \n");
    for (int i=0; i<4; i++){
        scanf("%d", &v1[i]);
    }
    printf("\n\n");
    for (int i=0; i<4; i++) printf("%d\t", v1[i]);
    
    printf("\nMudando elementos do vetor: \n");
    int v2[4];
    for (int i=0; i<4; i++)
        v2[i]=v1[i]*3;
    printf("\n---\n");
    for (int i=0; i<4; i++)
        printf("%d\t", v2[i]);
    
    //Vetores com random:
    int vetorRandom[5];
    printf("\n\nRandom: \n\n");
    for (int i=0; i<5; i++)
        vetorRandom[i]=rand() %10;//Precisa do stdlib.h e o %10 gera valores entre 0 e 10
    for (int i=0; i<5; i++)
        printf("%d\t", vetorRandom[i]);
    
    return 0;
}
