package bancopoo;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, int numeroConta, double limiteChequeEspecial) {
        super(titular, numeroConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Conta Corrente - Titular: " + titular + ", Saldo: R$ " + saldo + ", Limite Cheque Especial: R$ " + limiteChequeEspecial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limiteChequeEspecial)) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
            return false;
        }
    }
}
