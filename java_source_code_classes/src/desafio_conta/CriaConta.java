package java_source_code_classes.src.desafio_conta;

public class CriaConta {
    public static void main(String[] args) {

        Conta primeraConta = new Conta();
        primeraConta.depositar(200);

        // System.out.println(primeraConta.saldo);
        primeraConta.depositar(100);

        // System.out.println(primeraConta.saldo);

        Conta segundaConta = primeraConta;

        segundaConta.depositar(50);;

        // System.out.println("Primeira conta tem o saldo de: " + primeraConta.saldo);
        // System.out.println("Segunda conta tem o saldo de: " + segundaConta.saldo);

        Conta contaFelipe = new Conta();
        Conta contaGabriel = new Conta();

        contaFelipe.depositar(100);
        contaFelipe.transfere(100, contaGabriel);

        contaFelipe.setTitular(new Cliente());

        contaFelipe.getTitular().setNome("Felipe");

        System.out.println(contaFelipe.getTitular().getNome());
    }
}
