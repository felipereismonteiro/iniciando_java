package java_source_code_classes.src.inicando_java.estruturas_repeticao;

import java.util.Scanner;


public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notas = 0;
        float media = 0;
        int quantidadeNotas = 0;
        int loop = 0;

        System.out.print("Digite a quantidade de notas: ");
        quantidadeNotas = scanner.nextInt();

        while (loop < quantidadeNotas) {
            System.out.print("Digite a nota do filme: ");
            notas+=scanner.nextInt();
            loop++;
        }

        media = (float) notas / quantidadeNotas;
        System.out.println(media);
    }
}
