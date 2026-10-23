package br.edu.fatecpg.view;

import br.edu.fatecpg.controller.VeiculoController;

// Ponto de entrada do programa
public class Main {

    public static void main(String[] args) {
        VeiculoController controller = new VeiculoController();

        controller.moverCarro();
        controller.moverBicicleta();
    }
}
