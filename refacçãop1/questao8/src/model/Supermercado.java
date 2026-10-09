package model;

public class Supermercado {
    private String[] nomesProdutos = {
        "Arroz", "Feijão", "Óleo", "Macarrão"
    };

    private double[] precos = {25.0, 10.0, 8.5, 6.0};
    private double[] descontos = {0.10, 0.05, 0.15, 0.08};

    public void listarProdutos() {
        System.out.println("--- Lista de Produtos PriceMax ---");

        for (int i = 0; i < nomesProdutos.length; i++) {
            if (nomesProdutos[i] != null) {
                double precoComDesconto =
                    precos[i] * (1 - descontos[i]);

                System.out.printf(
                    "%s | Original: R$ %.2f | Com Desconto: R$ %.2f%n",
                    nomesProdutos[i], precos[i], precoComDesconto
                );
            }
        }
    }

    public double calcularTotalComDesconto() {
        double total = 0;

        for (int i = 0; i < nomesProdutos.length; i++) {
            if (nomesProdutos[i] != null) {
                total += precos[i] * (1 - descontos[i]);
            }
        }

        return total;
    }

    public void maiorEconomia() {
        int indexMaior = -1;
        double maiorValor = -1;

        for (int i = 0; i < nomesProdutos.length; i++) {
            if (nomesProdutos[i] != null) {
                double economia = precos[i] * descontos[i];

                if (economia > maiorValor) {
                    maiorValor = economia;
                    indexMaior = i;
                }
            }
        }

        if (indexMaior != -1) {
            System.out.printf(
                "Maior economia: %s (R$ %.2f)%n",
                nomesProdutos[indexMaior], maiorValor
            );
        } else {
            System.out.println("Nenhum produto disponível.");
        }
    }

    public void comprarProduto(int indice) {
        if (indice >= 0 && indice < nomesProdutos.length
                && nomesProdutos[indice] != null) {
            nomesProdutos[indice] = null;
            precos[indice] = 0;
            descontos[indice] = 0;

            System.out.println("Produto comprado com sucesso.");
        } else {
            System.out.println("Índice inválido ou produto indisponível.");
        }
    }

    public void reporProduto(
            int indice, String nome, double preco, double desconto) {

        if (indice >= 0 && indice < nomesProdutos.length
                && nome != null && !nome.trim().isEmpty()
                && preco >= 0 && desconto >= 0 && desconto <= 1) {

            nomesProdutos[indice] = nome;
            precos[indice] = preco;
            descontos[indice] = desconto;

            System.out.println("Produto reposto com sucesso.");
        } else {
            System.out.println("Dados inválidos para reposição.");
        }
    }
}