package gof.factory;

// Produto
interface Produto {
    void criar();
}

// Produtos Concretos
class ProdutoConcretoA implements Produto {
    @Override
    public void criar() {
        System.out.println("Produto Concreto A criado!");
    }
}

class ProdutoConcretoB implements Produto {
    @Override
    public void criar() {
        System.out.println("Produto Concreto B criado!");
    }
}

// Criador
abstract class Criador {
    public abstract Produto fabricarProduto();
}

// Criadores Concretos
class CriadorConcretoA extends Criador {
    @Override
    public Produto fabricarProduto() {
        return new ProdutoConcretoA();
    }
}

class CriadorConcretoB extends Criador {
    @Override
    public Produto fabricarProduto() {
        return new ProdutoConcretoB();
    }
}

// Teste
public class Main {
    public static void main(String[] args) {
        Criador criador = new CriadorConcretoA();
        Produto produto = criador.fabricarProduto();
        produto.criar();

        criador = new CriadorConcretoB();
        produto = criador.fabricarProduto();
        produto.criar();
    }
}
