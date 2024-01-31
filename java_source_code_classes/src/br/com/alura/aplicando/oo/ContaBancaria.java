package java_source_code_classes.src.br.com.alura.aplicando.oo;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void sacar(int valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Erro ao sacar");
        }
    }

    public double depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return this.saldo;
        } else {
            return 0.0;
        }
    }
}
