package ExerciciosDeRevisaoAula01;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio02Aula01 {
    public static void main(String[] args) {
        // Definindo o caminho do arquivo
    	String path = "C:/Users/laboratorio/Desktop/dados.txt"; //Se for a barra ao contrário, precisa de 2
        //C:\Users\laboratorio\Desktop
        
        // Tratando possíveis exceções com try-catch
        try {
            // Lendo o arquivo (se necessário)
            BufferedReader buffRead = new BufferedReader(new FileReader(path));
            String linha;
            //System.out.println("Conteúdo do arquivo:");
            //Confirmação:
            /*while ((linha = buffRead.readLine()) != null) {
                System.out.println(linha);  // Exibindo conteúdo do arquivo
            }*/
            buffRead.close();  // Fechando o BufferedReader
            
            // Criando o tamanho do vetor: 
            System.out.println("Digite o tamanho desejado: ");
            Scanner tamanhoDigitado = new Scanner(System.in);
            int tamanho = tamanhoDigitado.nextInt();
            tamanhoDigitado.close();
            
            // Gerando N números aleatórios:
            int[] vetorAleatorios = new int[tamanho];
            for (int i = 0; i < tamanho; i++) {
                vetorAleatorios[i] = (int)(Math.random() * 100);  // Gerando números aleatórios entre 0 e 99
            }
            
            // Números aleatórios no arquivo
            BufferedWriter escrevendoNoArquivo = new BufferedWriter(new FileWriter(path));  // O "true" do path, true permite que
            //a cada vez que o usuario escreva no arquivo, os valores antigos nao sejam apagados
            for (int i=0; i<vetorAleatorios.length; i++) {
                escrevendoNoArquivo.write(vetorAleatorios[i] + "\n");  // Escreve cada número em uma nova linha
            }
            
            escrevendoNoArquivo.close();  // Fechando o BufferedWriter, PRECISA
            
            //Precisa abrir o buffRead mais uma vez pra armazenar os valores em um novo vetor: 
            
         // Lendo novamente o arquivo após a escrita
            // Reabrindo o BufferedReader para ler os números recém adicionados
            BufferedReader lendoDoArquivo = new BufferedReader(new FileReader(path));
            int[] vetorLidos = new int[tamanho];
            int j = 0;
            
            //Lógica: Enquanto a linha não for null, vai continuar armazenando o valor no novo vetor
            while ((linha = lendoDoArquivo.readLine()) != null && j < tamanho) {
                vetorLidos[j] = Integer.parseInt(linha);  // Armazenando no vetor
                j++;
            }
            
            lendoDoArquivo.close();  
            
            // Verificando se os números lidos são iguais aos gerados
            boolean verificandoSaoIguais = true;
            for (int i = 0; i < tamanho; i++) {
                if (vetorAleatorios[i] != vetorLidos[i]) {
                    verificandoSaoIguais = false;
                    break;  // Sai do loop na primeira diferença encontrada
                }
            }
            if (verificandoSaoIguais) {
            	System.out.println("\nOs vetores sao iguais\n\n");
            	//Agora vamos mostrar os vetores lidos: 
            	for (int i=0; i< vetorLidos.length; i++) System.out.println(vetorLidos[i]+"\t");
            }
            else System.out.println("Nao sao iguais");
            
            //Para garantia, vamos comparar os valores do novo vetor com o antigo: 
            for (int i=0; i<tamanho; i++) {
            	System.out.println(vetorAleatorios[i]+"\t");
            	System.out.println(vetorLidos[i]+"\t");
            }

        } catch (IOException e) {
            // Captura de exceções se ocorrer algum erro na leitura ou escrita do arquivo
            System.out.println("Erro ao acessar o arquivo: " + e.getMessage());
        }
    }
}

