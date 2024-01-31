package java_source_code_classes.src.br.com.alura.aplicando.oo;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Erro ao declarar a idade");
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public boolean verificarIdade() {
        if (this.idade >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
