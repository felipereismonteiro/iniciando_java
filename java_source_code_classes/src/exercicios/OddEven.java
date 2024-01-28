package java_source_code_classes.src.exercicios;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero e diremos se é par ou impar: ");
        long oddEvenNumber = scanner.nextLong();

        if (oddEvenNumber % 2 == 0) {
            System.out.println("Par!");
        } else {
            System.out.println("Ìmpar!");
        }
    }
}
