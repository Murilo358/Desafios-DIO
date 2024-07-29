package bancopoo;

public class BancoDigital {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Alice", 12345, 500.0);
        ContaPoupanca conta2 = new ContaPoupanca("Bob", 67890);

        conta1.depositar(1000);
        conta2.depositar(500);

        conta1.exibirSaldo();
        conta2.exibirSaldo();

        conta1.sacar(200);
        conta2.sacar(100);

        conta1.exibirSaldo();
        conta2.exibirSaldo();

        conta1.transferir(conta2, 300);
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
