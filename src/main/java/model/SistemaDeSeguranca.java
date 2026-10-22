package model;

public class SistemaDeSeguranca implements Autenticavel {
    private final String usuarioCorreto = "admin";
    private final String senhaCorreta = "1234";
    private boolean autenticado = false;

    @Override
    public boolean login(String usuario, String senha) {
        autenticado = usuarioCorreto.equals(usuario)
                && senhaCorreta.equals(senha);
        return autenticado;
    }

    @Override
    public void logout() {
        autenticado = false;
    }

    public boolean isAutenticado() {
        return autenticado;
    }
}
