package view;

import java.util.Scanner;
import controller.FuncionarioController;

public class FuncionarioView {
    public void iniciar(Scanner scanner) {
        FuncionarioController controller = new FuncionarioController();

        System.out.println("\n--- Funcionários ---");
        System.out.println("Tipos: gerente, vendedor, faxineiro");
        System.out.println("Ações: ponto, trabalhar, caixa, venda, material");
        System.out.print("Tipo de funcionário: ");
        String tipo = scanner.nextLine();
        System.out.print("Ação: ");
        String acao = scanner.nextLine();

        try {
            controller.executarAcao(tipo, acao);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
