package br.edu.fatec.exerrcicio2;

public class Site {

    String url;
    String dominio;
    String hospedagem;
    String layout;

    public void navegar() {
        System.out.println("Navegando no site " + url);
    }

    public void carregar() {
        System.out.println("Site " + url + " carregado.");
    }
}