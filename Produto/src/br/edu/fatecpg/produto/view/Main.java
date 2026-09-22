package br.edu.fatecpg.produto.view;

import br.edu.fatecpg.produto.model.Produto;

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Notebook");
        produto.setPreco(3500);
        produto.setQuantidadeEstoque(10);

        System.out.println("--- Dados do produto ---");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em estoque: "
                + produto.getQuantidadeEstoque());

        System.out.println("\n--- Testando preço negativo ---");
        produto.setPreco(-500);

        System.out.println("\n--- Testando estoque negativo ---");
        produto.setQuantidadeEstoque(-10);

        System.out.println("\n--- Valores finais ---");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em estoque: "
                + produto.getQuantidadeEstoque());
    }
}