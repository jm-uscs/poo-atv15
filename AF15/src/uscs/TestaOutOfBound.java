package uscs;

import java.util.Scanner;

public class TestaOutOfBound {
    public static void main(String[] args) {
        //Digite um número fora do limite do vetor para testar a exceção
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Insira um índice para acessar o vetor (0-9): ");
            int indice = s.nextInt();
            System.out.println("Acessando o elemento na posição: " + indice + " do vetor: " + vetor[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do vetor.");
        }
    }
}
