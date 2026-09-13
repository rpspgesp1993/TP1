package br.edu.fatec.exerrcicio2;

public class Aplicativo {

    String nome;
    String versao;
    String desenvolvedor;
    double tamanho;

    public void executar() {
        System.out.println("Aplicativo " + nome + " sendo executado.");
    }

    public void fechar() {
        System.out.println("Aplicativo " + nome + " fechado.");
    }
}