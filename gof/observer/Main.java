package gof.observer;

import java.util.ArrayList;
import java.util.List;

interface Sujeito {
    void adicionarObservador(Observador observador);
    void removerObservador(Observador observador);
    void notificarObservadores();
}

interface Observador {
    void atualizar(String mensagem);
}

class SujeitoConcreto implements Sujeito {
    private List<Observador> observadores = new ArrayList<>();
    private String mensagem;

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(mensagem);
        }
    }

    public void definirMensagem(String mensagem) {
        this.mensagem = mensagem;
        notificarObservadores();
    }
}

class ObservadorConcreto implements Observador {
    private String nome;

    public ObservadorConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu a mensagem: " + mensagem);
    }
}

public class Main {
    public static void main(String[] args) {
        SujeitoConcreto sujeito = new SujeitoConcreto();

        Observador observador1 = new ObservadorConcreto("Observador 1");
        Observador observador2 = new ObservadorConcreto("Observador 2");

        sujeito.adicionarObservador(observador1);
        sujeito.adicionarObservador(observador2);

        sujeito.definirMensagem("Olá, observadores!");
    }
}

