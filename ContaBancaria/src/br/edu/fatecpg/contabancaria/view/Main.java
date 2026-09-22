package br.edu.fatecpg.contabancaria.view;

import br.edu.fatecpg.contabancaria.model.ContaBancaria;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Rafael");

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        conta.depositar(1000);

        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        conta.sacar(300);

        System.out.println("Saldo após saque: R$ " + conta.getSaldo());

        conta.sacar(1000);

        conta.depositar(-50);

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}