package br.edu.fatecpg.abstracao.model;

public class Carro {

    private String cor;
    private String modelo;
    private double capacidadeTanque;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double calcularValorTanque(double valorGasolina) {
        return capacidadeTanque * valorGasolina;
    }
}