package br.edu.fatecpg.calculadora.view;

public class CalculadoraView {

    // Exibe o título do programa.
    public void exibirTitulo() {
        System.out.println("=== Calculadora MVC ===");
        System.out.println();
    }

    // Exibe o resultado de uma operação.
    public void exibirResultado(String mensagem, Object resultado) {
        System.out.println(mensagem + resultado);
    }
}
