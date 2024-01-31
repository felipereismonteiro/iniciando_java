package java_source_code_classes.src.br.com.alura.aplicando.oo;

import java_source_code_classes.src.br.com.alura.desafio.ContaBancaria;

public class Pessoa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Felipe", 21);

        ContaBancaria conta = new ContaBancaria();

        double returnedValue = conta.consultarSaldo(10.0);

        System.out.println(returnedValue);
        aluno.exibeInformacoes();
    }
}
