package br.edu.fatecpg.calculadora.controller;

import br.edu.fatecpg.calculadora.model.Calculadora;
import br.edu.fatecpg.calculadora.view.CalculadoraView;

public class CalculadoraController {

    private final Calculadora calculadora;
    private final CalculadoraView view;

    // Inicializa os objetos das camadas Model e View.
    public CalculadoraController() {
        calculadora = new Calculadora();
        view = new CalculadoraView();
    }

    // Executa testes de todas as versões sobrecarregadas.
    public void executar() {
        view.exibirTitulo();

        // Teste 1: dois inteiros.
        int resultado1 = calculadora.somar(10, 20);
        view.exibirResultado("Soma de dois inteiros: ", resultado1);

        // Teste 2: três inteiros.
        int resultado2 = calculadora.somar(10, 20, 30);
        view.exibirResultado("Soma de três inteiros: ", resultado2);

        // Teste 3: dois doubles.
        double resultado3 = calculadora.somar(5.5, 2.3);
        view.exibirResultado("Soma de dois doubles: ", resultado3);

        // Teste adicional: inteiro negativo.
        int resultado4 = calculadora.somar(-5, 15);
        view.exibirResultado("Soma com inteiro negativo: ", resultado4);

        // Teste adicional: outros valores decimais.
        double resultado5 = calculadora.somar(12.75, 3.25);
        view.exibirResultado("Soma de outros doubles: ", resultado5);
    }
}
