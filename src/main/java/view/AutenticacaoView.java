package view;

import java.util.Scanner;
import controller.AutenticacaoController;

public class AutenticacaoView {
    public void iniciar(Scanner scanner) {
        AutenticacaoController controller = new AutenticacaoController();
        boolean loginRealizado = false;

        System.out.println("\n--- Autenticação ---");
        while (!loginRealizado) {
            System.out.print("Usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            loginRealizado = controller.login(usuario, senha);
            if (loginRealizado) {
                System.out.println("Bem-vindo ao sistema, " + usuario + "!");
            } else {
                System.out.println("Usuário ou senha incorretos. Tente novamente.\n");
            }
        }

        System.out.print("Deseja fazer logout? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            controller.logout();
            System.out.println("Logout realizado com sucesso.");
        } else {
            System.out.println("Você continua autenticado.");
        }
        System.out.println("Autenticado: " + controller.isAutenticado());
    }
}
