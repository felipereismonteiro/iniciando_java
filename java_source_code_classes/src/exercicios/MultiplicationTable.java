package java_source_code_classes.src.exercicios;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um número para mostrar sua tabuada: ");
        long numeroTabuada = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            long divisao = numeroTabuada * i;
            System.out.println(numeroTabuada + " x " + i + " = " + divisao);
        }
    }
}
