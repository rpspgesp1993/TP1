package br.edu.fatecpg.controller;

import br.edu.fatecpg.model.Carro;
import br.edu.fatecpg.model.Bicicleta;

// Controller coordena a execução dos comportamentos
public class VeiculoController {

    public void moverCarro() {
        Carro carro = new Carro();
        carro.mover();
    }

    public void moverBicicleta() {
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.mover();
    }
}
