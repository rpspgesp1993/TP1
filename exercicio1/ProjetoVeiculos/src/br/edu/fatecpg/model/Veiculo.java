package br.edu.fatecpg.model;

// Classe base dos veículos
public class Veiculo {

    // Método que poderá ser sobrescrito pelas subclasses
    public void mover() {
        System.out.println("O veículo está se movendo");
    }
}
