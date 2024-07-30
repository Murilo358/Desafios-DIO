package gof.builder;
public class CarroBuilder {
    private String modelo;
    private String cor;
    private int ano;
    private String tipoDeCombustivel;

    public CarroBuilder comModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarroBuilder comCor(String cor) {
        this.cor = cor;
        return this;
    }

    public CarroBuilder comAno(int ano) {
        this.ano = ano;
        return this;
    }

    public CarroBuilder comTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        return this;
    }

    public Carro construir() {
        return new Carro(modelo, cor, ano, tipoDeCombustivel);
    }
}

