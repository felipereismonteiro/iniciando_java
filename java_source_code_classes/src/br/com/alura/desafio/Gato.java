package java_source_code_classes.src.br.com.alura.desafio;

public class Gato extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Au au");
    }

    void abanarRabo() {
        System.out.println("Abanando o rabo");
    }
}
