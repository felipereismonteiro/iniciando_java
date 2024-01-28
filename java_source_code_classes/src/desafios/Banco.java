package java_source_code_classes.src.desafios;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seus dados para iniciar sua conta: ");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Tipo da conta - Corrente ou Poupança: ");
        String tipoConta = scanner.nextLine();
        System.out.print("Saldo Inicial: ");
        double saldo = scanner.nextDouble();

        String quebraMensagem = "*************************************************";
        String mensagem = String.format("""
                %s
                Nome: %s
                Tipo da conta: %s
                Saldo inicial: %.2f
                %s
                """, quebraMensagem, nome, tipoConta, saldo, quebraMensagem);
        String opcoesEscolha = String.format("""
                %s
                                
                Escolha sua opção:
                1 - Consultar saldo
                2 - Depositar valor
                3 - Transferencia de valor
                4 - Sair
                
                %s
                """, quebraMensagem, quebraMensagem);
        System.out.println("Conta criada!");
        System.out.println(mensagem);

        int escolha = 0;

        while (escolha != 4) {
            System.out.println(opcoesEscolha);
            escolha = scanner.nextInt();

            if (escolha == 1) {
                String mensagemEscolhaResultado = String.format("Seu saldo é de %.2f", saldo);
                System.out.printf("""
                            %s
                            
                            %s
                            
                            %s
                        """, quebraMensagem, mensagemEscolhaResultado, quebraMensagem);
            } else if (escolha == 2) {
                System.out.print("Digite o valor a ser depositado: ");
                saldo+= scanner.nextDouble();
                String mensagemEscolhaResultado = String.format("Seu valor atualizado: %.2f%n", saldo);


                System.out.printf("""
                        %s
                        
                        %s
                        
                        %s
                        """, quebraMensagem, mensagemEscolhaResultado, quebraMensagem);
            } else if (escolha == 3) {
                System.out.print("Digite o valor a ser transferido: ");
                double valorATransferir = scanner.nextDouble();
                if (valorATransferir > saldo) {
                    System.out.println("Você não possui saldo suficiente para essa transação!");
                } else {
                    saldo -= valorATransferir;
                }

                String mensagemEscolhaResultado = String.format("Saldo atualizado: %.2f", saldo);
                System.out.printf("""
                            %s
                            
                            %s
                            
                            %s
                        """, quebraMensagem, mensagemEscolhaResultado, quebraMensagem);
            } else {
                String mensagemEscolhaResultado = String.format("""
                            %s
                            
                            Saindo da aplicação...
                            
                            Saldo final: %.2f
                        
                            %s
                        """, quebraMensagem, saldo, quebraMensagem);
                System.out.println(mensagemEscolhaResultado);
            }

        }
    }
}
