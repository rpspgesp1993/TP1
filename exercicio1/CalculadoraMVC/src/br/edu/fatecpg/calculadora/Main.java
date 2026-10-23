package br.edu.fatecpg.calculadora;

import br.edu.fatecpg.calculadora.controller.CalculadoraController;

public class Main {

    public static void main(String[] args) {
        // Cria o Controller e inicia o programa.
        CalculadoraController controller = new CalculadoraController();
        controller.executar();
    }
}
