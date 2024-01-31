package java_source_code_classes.src.br.com.alura.desafios.desafio2;

public class Produto implements Vendavel{
    @Override
    public double calcularTotalProdutos(ProdutoFisico produto, int quantidade) {
        return (produto.calcularPrecoFinal(10) * 3) - (produto.calcularPrecoFinal(10) * 0.02);
    }
}
