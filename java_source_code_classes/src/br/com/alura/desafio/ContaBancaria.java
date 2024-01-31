package java_source_code_classes.src.br.com.alura.desafio;

public class ContaBancaria {
    private double saldo;

    public void depositar(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Erro ao depositar");
        }
    }

    public double sacarSaldo(double valor) {
        if (this.saldo >= valor) {
            return this.saldo -= valor;
        } else {
            System.out.println("Erro ao sacar");
            return this.saldo;
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}
