package java_source_code_classes.src.desafio_conta;

public class CriaConta {
    public static void main(String[] args) {

        Conta primeraConta = new Conta();
        primeraConta.saldo = 200;

        // System.out.println(primeraConta.saldo);
        primeraConta.saldo += 100;

        // System.out.println(primeraConta.saldo);

        Conta segundaConta = primeraConta;

        segundaConta.saldo = 50;

        // System.out.println("Primeira conta tem o saldo de: " + primeraConta.saldo);
        // System.out.println("Segunda conta tem o saldo de: " + segundaConta.saldo);

        Conta contaFelipe = new Conta();
        Conta contaGabriel = new Conta();

        contaFelipe.deposita(100);
        contaFelipe.transfere(100, contaGabriel);

        System.out.println(contaGabriel.saldo);
        System.out.println(contaFelipe.saldo);

    }
}
