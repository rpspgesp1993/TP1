package br.edu.fatec.exerrcicio2;

public class ContaBancaria {

    String numeroConta;
    double saldoAtual;
    String titular;
    String agencia;

    public void depositar(double valor) {
        saldoAtual += valor;
        System.out.println("Depósito de R$ " + valor + " realizado.");
    }

    public void sacar(double valor) {
        if (valor <= saldoAtual) {
            saldoAtual -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}