package java_source_code_classes.src.exercicios;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Identificador de número negativo.");
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Numero é negativo!");
        } else {
            System.out.println("Numero positivo!");
        }
    }
}
