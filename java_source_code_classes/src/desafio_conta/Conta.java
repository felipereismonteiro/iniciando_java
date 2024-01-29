package java_source_code_classes.src.desafio_conta;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void depositar(double valor) {
        this.saldo+=valor;
    }

    public boolean saca(double valor) {
        if (this.saldo > valor) {
            this.saldo-=valor;
            return true;
        }

        return false;
    }

    public boolean transfere(double valor, Conta contaDestino) {
        if (this.saldo >= valor) {
            this.saldo-=valor;
            contaDestino.depositar(valor);
            return true;
        }

        return false;
    }
}
