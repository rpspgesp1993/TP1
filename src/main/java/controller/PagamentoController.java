package controller;

import model.Pagamento;
import model.PagamentoCartao;
import model.PagamentoDinheiro;

public class PagamentoController {
    public String processarPagamento(double valor, String formaPagamento) {
        Pagamento pagamento;

        if (formaPagamento.equalsIgnoreCase("cartao")) {
            pagamento = new PagamentoCartao(valor);
        } else if (formaPagamento.equalsIgnoreCase("dinheiro")) {
            pagamento = new PagamentoDinheiro(valor);
        } else {
            throw new IllegalArgumentException("Forma de pagamento inválida.");
        }

        return pagamento.emitirRecibo();
    }
}
