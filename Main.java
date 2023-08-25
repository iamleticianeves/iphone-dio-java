public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Música 1");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.example.com");
        iphone.adicionarNovaAba("https://www.google.com");
        iphone.atualizarPagina();
    }
}
