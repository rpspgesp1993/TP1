package model;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void reajustarSalario(double novoSalario) {
        if (novoSalario > 0) {
            this.salario = novoSalario;
        } else {
            System.out.println("ESSE SALÁRIO É INVALIDO");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}