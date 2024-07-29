package bancopoo;

public abstract class Conta implements Transferivel {
    protected String titular;
    protected double saldo;
    protected int numeroConta;

    public Conta(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
            return false;
        }
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " para a conta " + contaDestino.numeroConta + " realizada com sucesso.");
        } else {
            System.out.println("Falha na transferência. Saldo insuficiente.");
        }
    }

    public abstract void exibirSaldo();
}
