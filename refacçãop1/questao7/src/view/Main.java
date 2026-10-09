package view;

import model.Funcionario;

public class Main {

    public static void main(String[] args) {

        Funcionario func = new Funcionario();

        func.setNome("ZEZÉ DI CAMARGO");
        func.reajustarSalario(2400.00);
        func.setCargo("CATADOR DE TOMATE");

        System.out.println("HOLERITE:");
        System.out.println("Nome: " + func.getNome());
        System.out.println("Cargo: " + func.getCargo());
        System.out.printf("Salário: R$ %.2f%n", func.getSalario());
    }
}