package controller;

import model.Faxineiro;
import model.Funcionario;
import model.Gerente;
import model.Vendedor;

public class FuncionarioController {
    private final Gerente gerente = new Gerente();
    private final Vendedor vendedor = new Vendedor();
    private final Faxineiro faxineiro = new Faxineiro();

    public void executarAcao(String tipo, String acao) {
        Funcionario funcionario;

        switch (tipo.toLowerCase()) {
            case "gerente" -> funcionario = gerente;
            case "vendedor" -> funcionario = vendedor;
            case "faxineiro" -> funcionario = faxineiro;
            default -> throw new IllegalArgumentException("Funcionário inválido.");
        }

        switch (acao.toLowerCase()) {
            case "ponto" -> funcionario.baterPonto();
            case "trabalhar" -> funcionario.trabalhar();
            case "caixa" -> {
                if (funcionario instanceof Gerente g) g.fecharCaixa();
                else throw new IllegalArgumentException("Ação exclusiva do gerente.");
            }
            case "venda" -> {
                if (funcionario instanceof Vendedor v) v.realizarVenda();
                else throw new IllegalArgumentException("Ação exclusiva do vendedor.");
            }
            case "material" -> {
                if (funcionario instanceof Faxineiro f) f.solicitarMaterial();
                else throw new IllegalArgumentException("Ação exclusiva do faxineiro.");
            }
            default -> throw new IllegalArgumentException("Ação inválida.");
        }
    }
}
