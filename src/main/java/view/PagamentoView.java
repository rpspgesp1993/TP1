package view;

import java.util.Scanner;
import controller.PagamentoController;

public class PagamentoView {
    public void iniciar(Scanner scanner) {
        PagamentoController controller = new PagamentoController();

        System.out.println("\n--- Pagamentos ---");
        System.out.print("Valor do pagamento: R$ ");
        try {
            double valor = Double.parseDouble(scanner.nextLine().replace(",", "."));
            System.out.print("Forma (cartao/dinheiro): ");
            String forma = scanner.nextLine();

            System.out.println();
            System.out.println(controller.processarPagamento(valor, forma));
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
