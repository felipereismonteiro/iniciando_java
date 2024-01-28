package condicionais;

public class Condicionais {
 public static void main(String[] args) {
  int anoLancamento = 2022;
  int nota = 5;
  boolean includidoNoPlano = true;

  String nome = "felipe";

  if (nome.equals("felipe")) {
    System.out.println("Seu nome é Felipe");
  }

  if(anoLancamento >= 2022 && includidoNoPlano && nota > 4) {
   System.out.println("Filme em lançamento! e incluido no plano e nota acima de 4");
  } else {
   System.out.println("Filme retro que vale a pena assistir");
  }
 }
}