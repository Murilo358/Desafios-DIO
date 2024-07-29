package bancopoo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, int numeroConta) {
        super(titular, numeroConta);
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Conta Poupança - Titular: " + titular + ", Saldo: R$ " + saldo);
    }
}