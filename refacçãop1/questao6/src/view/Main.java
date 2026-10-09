package view;

import model.Livro;

public class Main {

    public static void main(String[] args) {

        Livro meuLivro = new Livro();

        meuLivro.titulo = "50 TONS DE CINZA";
        meuLivro.autor = "VALCIR CARRASCO";
        meuLivro.anoPublicacao = 1827;

        System.out.println("RELATORIO");
        System.out.println("TITULO: " + meuLivro.titulo);
        System.out.println("AUTOR: " + meuLivro.autor);
        System.out.println("ANO DE PUBLICAÇÃO: " + meuLivro.anoPublicacao);

    }
}