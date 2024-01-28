package java_source_code_classes.src.estruturas_repeticao;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notas = 0;
        float media = 0;
        int quantidadeNotas = 3;

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a nota do filme: ");
            notas+=scanner.nextInt();
        }

        media = (float) notas / quantidadeNotas;

        System.out.println(media);
    }
}
