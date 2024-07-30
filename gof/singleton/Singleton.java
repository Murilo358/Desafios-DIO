package gof.singleton;

public class Singleton {

    private static Singleton instanciaUnica;

    private Singleton() {
    }

    public static synchronized Singleton getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    public void mostrarMensagem() {
        System.out.println("Olá, eu sou a única instância da classe Singleton!");
    }
}
