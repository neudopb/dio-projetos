package edu.dio;

public class Iphone {

    public static void main(String[] args) {

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("teste");

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}
