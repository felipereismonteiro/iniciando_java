package java_source_code_classes.src.exercicios;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                    Escolha qual calculo fazer
                    1 - Quadrado
                    2 - Circulo
                """);
        int escolha = scanner.nextInt();
        if (escolha == 1) {
            System.out.println("Calculando área do Quadrado...");
        } else {
            System.out.println("Calculando área do Circulo...");
        }
    }
}
