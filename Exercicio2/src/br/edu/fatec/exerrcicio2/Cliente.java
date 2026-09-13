package br.edu.fatec.exerrcicio2;

public class Cliente {

    String nomeCompleto;
    String cpfCnpj;
    String endereco;
    String email;

    public void cadastrar() {
        System.out.println("Cliente " + nomeCompleto + " cadastrado.");
    }

    public void comprar() {
        System.out.println(nomeCompleto + " realizou uma compra.");
    }
}