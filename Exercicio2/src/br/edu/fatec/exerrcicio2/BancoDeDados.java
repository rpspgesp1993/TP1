package br.edu.fatec.exerrcicio2;

public class BancoDeDados {

    String nomeServidor;
    int quantidadeTabelas;
    double capacidade;
    String SGBD;

    public void consultar() {
        System.out.println("Consulta realizada no banco " + nomeServidor);
    }

    public void inserir() {
        System.out.println("Dados inseridos no banco " + nomeServidor);
    }
}