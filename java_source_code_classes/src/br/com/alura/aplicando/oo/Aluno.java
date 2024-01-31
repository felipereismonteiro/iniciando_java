package java_source_code_classes.src.br.com.alura.aplicando.oo;

public class Aluno {
    private String nome;
    private int idade;

    Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void exibeInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}
