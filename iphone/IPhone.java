package iphone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("musica");

        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        meuIPhone.exibirPagina("http://www.google.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}

