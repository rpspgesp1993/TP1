package br.edu.fatec.exerrcicio2;

public class Usuario {

    String login;
    String senha;
    String nivelPermissao;
    boolean statusAtivo;

    public void autenticar() {
        if (statusAtivo) {
            System.out.println("Usuário " + login + " autenticado.");
        } else {
            System.out.println("Usuário inativo.");
        }
    }

    public void deslogar() {
        System.out.println("Usuário " + login + " deslogado.");
    }
}