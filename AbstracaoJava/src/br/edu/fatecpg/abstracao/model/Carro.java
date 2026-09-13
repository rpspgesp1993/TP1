package br.edu.fatecpg.abstracao.model;

public class Carro {

    // Atributos
    public String cor;
    public String modelo;
    public double capacidadeTanque;

    // Métodos
    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }

    public void buzinar() {
        System.out.println("Biiiiiiii!");
    }
}