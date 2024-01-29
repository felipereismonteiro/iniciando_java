package java_source_code_classes.src.desafio_conta;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalContas;
    /*
    * static é tipo uma variavel global
    * ele pertence a clase entao sempre que cria uma nova classe ele usa a variavel
    * que estava antes e como esta ++ no construtor ele simplesmente adiciona
    * mais um a variave global
    * */
    public Conta(int agencia, int numero) {
        Conta.totalContas++;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100; //isso significa que toda conta começa com 100 de saldo.
        System.out.println("Estou criando uma conta");
    }

    public static int getTotalContas() {
        // No caso a gente pode usar o totalContas mesmo que seja privado
        // e em um metodo estatico nao existe um this pq com ele instancia
        // a conta nao existe tipo um essa conta entende
        return Conta.totalContas;
    }

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
