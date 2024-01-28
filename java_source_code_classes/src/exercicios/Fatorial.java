package java_source_code_classes.src.exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero e diremos seu fatorial: ");
        long numeroEscolhido = scanner.nextLong();

        long fatorial = 0;
        for (int i = 1; i <=  numeroEscolhido; i++) {
            fatorial = numeroEscolhido * i;
            System.out.println(numeroEscolhido + " x " + i + " = " + fatorial);
        }

        System.out.println("Seu fatorial é: " + fatorial);
    }
}
