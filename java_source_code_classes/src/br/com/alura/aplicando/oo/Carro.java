package java_source_code_classes.src.br.com.alura.aplicando.oo;

public class Carro {
    private String modelo;
    private int ano;

    void fichaTecnica(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    int calculaIdadeCarro() {
        return this.ano - 2024;
    }
}
