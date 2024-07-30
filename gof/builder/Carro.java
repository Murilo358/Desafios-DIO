package gof.builder;

public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private String tipoDeCombustivel;

    public Carro(String modelo, String cor, int ano, String tipoDeCombustivel) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", tipoDeCombustivel='" + tipoDeCombustivel + '\'' +
                '}';
    }
}
