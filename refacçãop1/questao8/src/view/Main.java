package view;

import model.Supermercado;

public class Main {

    public static void main(String[] args) {

        Supermercado mercado = new Supermercado();

        System.out.println("=== 1. LISTAGEM INICIAL ===");
        mercado.listarProdutos();

        System.out.println("\n=== 2. TOTAL DA COMPRA ===");
        double totalCompra = mercado.calcularTotalComDesconto();

        System.out.printf(
            "Valor total da compra com descontos: R$ %.2f%n",
            totalCompra
        );

        System.out.println("\n=== 3. MAIOR ECONOMIA ===");
        mercado.maiorEconomia();

        System.out.println("\n=== 4. COMPRANDO UM PRODUTO ===");
        mercado.comprarProduto(2);

        System.out.println("\n--- Listagem após a compra ---");
        mercado.listarProdutos();

        System.out.println("\n=== 5. REPOSIÇÃO DE UM PRODUTO ===");
        mercado.reporProduto(2, "Azeite", 20.0, 0.10);

        System.out.println("\n--- Listagem final após reposição ---");
        mercado.listarProdutos();
    }
}