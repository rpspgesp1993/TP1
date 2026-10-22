package controller;

import model.SistemaDeSeguranca;

public class AutenticacaoController {
    private final SistemaDeSeguranca sistema = new SistemaDeSeguranca();

    public boolean login(String usuario, String senha) {
        return sistema.login(usuario, senha);
    }

    public void logout() {
        sistema.logout();
    }

    public boolean isAutenticado() {
        return sistema.isAutenticado();
    }
}
