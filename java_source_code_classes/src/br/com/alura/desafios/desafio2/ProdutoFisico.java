package java_source_code_classes.src.br.com.alura.desafios.desafio2;

public class ProdutoFisico implements Calculavel {
    @Override
    public double calcularPrecoFinal(double preco) {
        return preco - (preco * 0.05);
    }
}
