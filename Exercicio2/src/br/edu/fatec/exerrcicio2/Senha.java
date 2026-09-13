package br.edu.fatec.exerrcicio2;

public class Senha {

    String caracteresAlfanumericos;
    String nivelForca;
    String criptografia;
    String dataAlteracao;

    public void redefinir() {
        System.out.println("Senha redefinida.");
    }

    public void validar() {
        System.out.println("Senha validada.");
    }
}