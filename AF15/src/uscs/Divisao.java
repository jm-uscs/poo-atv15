package uscs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        int numerador, denominador;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Digite o numerador: ");
            numerador = s.nextInt();
            System.out.println("Digite o denominador: ");
            denominador = s.nextInt();
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite números inteiros.");
        } catch (Exception e) {
            System.out.println("Erro inesperado");
        } finally {
            s.close();
            System.out.println("Scanner fechado. Fim do programa.");
        }
    }
}
