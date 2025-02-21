package ExerciciosGptPilha;

import java.util.Scanner;
import java.util.Stack;

/*
 * Crie um programa em Java que simule um sistema de "Desfazer/Refazer" utilizando pilhas. O programa deve permitir ao usuário:

Digitar comandos (strings) e adicioná-los à pilha de ações.
Desfazer a última ação e armazená-la em uma pilha separada de "ações desfeitas".
Refazer a última ação desfeita.
Mostrar as ações atuais na pilha principal.
O programa deve oferecer um menu com opções para o usuário interagir.
 */

public class DesfazerRefazer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Stack<String> pilhaAcoes = new Stack<>();
        Stack<String> pilhaDesfeitos = new Stack<>();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar ação");
            System.out.println("2 - Desfazer última ação");
            System.out.println("3 - Refazer última ação");
            System.out.println("4 - Mostrar pilha de ações");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o \n

            switch (opcao) {
                case 1:
                    System.out.print("Digite a ação: ");
                    String acao = scanner.nextLine();
                    pilhaAcoes.push(acao);
                    pilhaDesfeitos.clear(); // Limpa a pilha de refazer ao adicionar uma nova ação
                    System.out.println("Ação adicionada.");
                    break;

                case 2:
                    if (!pilhaAcoes.isEmpty()) {
                        String desfeita = pilhaAcoes.pop();
                        pilhaDesfeitos.push(desfeita);
                        System.out.println("Ação desfeita: " + desfeita);
                    } else {
                        System.out.println("Nenhuma ação para desfazer.");
                    }
                    break;

                case 3:
                    if (!pilhaDesfeitos.isEmpty()) {
                        String refeita = pilhaDesfeitos.pop();
                        pilhaAcoes.push(refeita);
                        System.out.println("Ação refeita: " + refeita);
                    } else {
                        System.out.println("Nenhuma ação para refazer.");
                    }
                    break;

                case 4:
                    System.out.println("Ações na pilha: " + pilhaAcoes);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
