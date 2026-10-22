package app;

import java.util.Scanner;
import view.AutenticacaoView;
import view.FuncionarioView;
import view.PagamentoView;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;

            while (continuar) {
                System.out.println("\n=== Sistema Empresa (MVC) ===");
                System.out.println("1 - Funcionários");
                System.out.println("2 - Pagamentos");
                System.out.println("3 - Autenticação");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");

                String opcao = scanner.nextLine();
                switch (opcao) {
                    case "1" -> new FuncionarioView().iniciar(scanner);
                    case "2" -> new PagamentoView().iniciar(scanner);
                    case "3" -> new AutenticacaoView().iniciar(scanner);
                    case "0" -> continuar = false;
                    default -> System.out.println("Opção inválida.");
                }
            }
        }
        System.out.println("Programa encerrado.");
    }
}
