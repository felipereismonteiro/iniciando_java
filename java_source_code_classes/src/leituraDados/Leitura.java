package java_source_code_classes.src.leituraDados;

import java.util.Scanner;

public class Leitura {
 public static void main(String[] args) {
  Scanner leitura = new Scanner(System.in);

  System.out.print("Digite seu nome: ");
  String nome = leitura.nextLine();

  System.out.print("Qual sua idade: ");
  int idade = leitura.nextInt();

  System.out.println("Seu nome é: " + nome + " e vc tem " + idade + " anos");

  leitura.close();
  // Sempre bom fechar o scanner
 }
}