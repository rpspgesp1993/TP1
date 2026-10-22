package model;

/**
 * Classe-base abstrata para compartilhar comportamentos genéricos
 * entre os diferentes tipos de funcionários.
 */
public abstract class FuncionarioBase implements Funcionario {

    @Override
    public void baterPonto() {
        System.out.println("Funcionário bateu o ponto.");
    }

    @Override
    public void trabalhar() {
        System.out.println("Funcionário está trabalhando.");
    }
}
