package app;

import model.Pagamento;
import model.PagamentoCartao;
import model.PagamentoDinheiro;

/** Teste independente exigido pelo enunciado para as duas formas de pagamento. */
public class TestePagamento {

    public static void main(String[] args) {
        double valor = 100.00;

        Pagamento cartao = new PagamentoCartao(valor);
        System.out.println("=== PAGAMENTO COM CARTÃO ===");
        System.out.printf("Valor final: R$ %.2f%n", cartao.calcularPagamento());
        System.out.println(cartao.emitirRecibo());

        System.out.println();

        Pagamento dinheiro = new PagamentoDinheiro(valor);
        System.out.println("=== PAGAMENTO EM DINHEIRO ===");
        System.out.printf("Valor final: R$ %.2f%n", dinheiro.calcularPagamento());
        System.out.println(dinheiro.emitirRecibo());
    }
}
