package br.edu.fatecpg.abstracao.view;

import java.util.Scanner;

import br.edu.fatecpg.abstracao.model.Carro;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro();

        System.out.print("Digite a cor do carro: ");
        carro.setCor(scanner.nextLine());

        System.out.print("Digite o modelo do carro: ");
        carro.setModelo(scanner.nextLine());

        System.out.print("Digite a capacidade do tanque: ");
        carro.setCapacidadeTanque(scanner.nextDouble());

        System.out.print("Digite o valor da gasolina: R$ ");
        double valorGasolina = scanner.nextDouble();

        System.out.println("\n--- Dados do carro ---");

        System.out.println("Cor: " + carro.getCor());

        System.out.println("Modelo: " + carro.getModelo());

        System.out.println("Capacidade do tanque: "
                + carro.getCapacidadeTanque() + " litros");

        double valorTotal =
                carro.calcularValorTanque(valorGasolina);

        System.out.printf("Valor para encher o tanque: R$ %.2f%n",
                valorTotal);
    }
}