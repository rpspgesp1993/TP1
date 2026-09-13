package br.edu.fatec.exerrcicio2;

public class Pedido {

    int numeroIdentificacao;
    String dataCriacao;
    double valorTotal;
    String status;

    public void solicitar() {
        status = "Solicitado";
        System.out.println("Pedido " + numeroIdentificacao + " solicitado.");
    }

    public void pagar() {
        status = "Pago";
        System.out.println("Pedido " + numeroIdentificacao + " pago.");
    }
}