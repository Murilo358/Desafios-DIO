package gof.builder;

public class Main {
    public static void main(String[] args) {
        Carro carro = new CarroBuilder()
                .comModelo("Fusca")
                .comCor("Azul")
                .comAno(1975)
                .comTipoDeCombustivel("Álcool")
                .construir();

        System.out.println(carro);

        Carro outroCarro = new CarroBuilder()
                .comModelo("Civic")
                .comCor("Preto")
                .comAno(2023)
                .comTipoDeCombustivel("Gasolina")
                .construir();

        System.out.println(outroCarro);
    }
}

