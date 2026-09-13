package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstracao.model.Carro;

public class Main {

    public static void main(String[] args) {

        // Criando um objeto da classe Carro
        Carro carro1 = new Carro();

        // Definindo os atributos
        carro1.cor = "Vermelho";
        carro1.modelo = "Honda Civic";
        carro1.capacidadeTanque = 50;

        // Exibindo os atributos
        System.out.println("Carro");
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Capacidade do tanque: "
                + carro1.capacidadeTanque + " litros");

        System.out.println();

        // Executando os métodos
        carro1.ligar();
        carro1.acelerar();
        carro1.frear();
        carro1.buzinar();
    }
}