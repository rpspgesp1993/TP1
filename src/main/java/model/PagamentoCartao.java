package model;

import java.util.Locale;

public class PagamentoCartao implements Pagamento {
    private final double valor;

    public PagamentoCartao(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
        return valor * 1.05;
    }

    @Override
    public String emitirRecibo() {
        return String.format(Locale.forLanguageTag("pt-BR"),
            "Pagamento com Cartão%nValor original: R$ %.2f%nTaxa de 5%%: R$ %.2f%nValor final: R$ %.2f",
            valor, valor * 0.05, calcularPagamento());
    }
}
