package br.edu.fatecpg.model;

// Carro herda os métodos da classe Veiculo
public class Carro extends Veiculo {

    // Sobrescreve o método mover() da classe base
    @Override
    public void mover() {
        System.out.println("O carro está dirigindo");
    }
}
