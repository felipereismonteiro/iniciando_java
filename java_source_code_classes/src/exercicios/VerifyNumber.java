package java_source_code_classes.src.exercicios;

import java.util.Scanner;

public class VerifyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mensagem = """
                Digite um numero e diremos se
                são iguais, diferentes, o primeiro é maior ou o segundo é maior
                """;
        System.out.println(mensagem);


        System.out.print("Insira o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Insira o segundo numero: ");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        if (primeiroNumero > segundoNumero) {
            System.out.println("Primeiro numero é maior");
        } else {
            System.out.println("Segundo é maior");
        }
    }
}
