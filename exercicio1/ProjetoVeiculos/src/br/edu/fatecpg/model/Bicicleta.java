package br.edu.fatecpg.model;

// Bicicleta herda os métodos da classe Veiculo
public class Bicicleta extends Veiculo {

    // Sobrescreve o método mover() da classe base
    @Override
    public void mover() {
        System.out.println("A bicicleta está pedalando");
    }
}
