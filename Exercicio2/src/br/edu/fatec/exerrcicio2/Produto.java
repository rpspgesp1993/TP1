package br.edu.fatec.exerrcicio2;

public class Produto {

    String codigoSKU;
    String nome;
    double preco;
    int quantidadeEstoque;

    public void cadastrar() {
        System.out.println("Produto " + nome + " cadastrado.");
    }

    public void atualizar() {
        System.out.println("Produto " + nome + " atualizado.");
    }
}