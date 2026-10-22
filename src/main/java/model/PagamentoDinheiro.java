package model;

import java.util.Locale;

public class PagamentoDinheiro implements Pagamento {
    private final double valor;

    public PagamentoDinheiro(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
        return valor * 0.90;
    }

    @Override
    public String emitirRecibo() {
        return String.format(Locale.forLanguageTag("pt-BR"),
            "Pagamento em Dinheiro%nValor original: R$ %.2f%nDesconto de 10%%: R$ %.2f%nValor final: R$ %.2f",
            valor, valor * 0.10, calcularPagamento());
    }
}
