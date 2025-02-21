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
            
            // Gerando N números aleatórios:
            int[] vetorAleatorios = new int[tamanho];
            for (int i = 0; i < tamanho; i++) {
                vetorAleatorios[i] = (int)(Math.random() * 100);  // Gerando números aleatórios entre 0 e 99
            }
            
            // Números aleatórios no arquivo
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true));  // O "true" adiciona o número no final dele
            for (int i=0; i<vetorAleatorios.length; i++) {
                buffWrite.write(vetorAleatorios[i] + "\n");  // Escreve cada número em uma nova linha
            }
            
            buffWrite.close();  // Fechando o BufferedWriter, PRECISA
            
            //Precisa abrir o buffRead mais uma vez pra armazenar os valores em um novo vetor: 
            
         // Lendo novamente o arquivo após a escrita
            // Reabrindo o BufferedReader para ler os números recém adicionados
            buffRead = new BufferedReader(new FileReader(path));
            System.out.println("Conteúdo do arquivo após a adição:");
            int[] vetorLidos = new int[tamanho];
            int j = 0;
            
            //Lógica: Enquanto a linha não for null, vai continuar armazenando o valor no novo vetor
            while ((linha = buffRead.readLine()) != null && j < tamanho) {
                vetorLidos[j] = Integer.parseInt(linha);  // Armazenando no vetor
                j++;
            }
            
            buffRead.close();  
            
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

