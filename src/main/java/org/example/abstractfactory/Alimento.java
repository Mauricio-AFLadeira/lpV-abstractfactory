package org.example.abstractfactory;

public class Alimento {

    private Qualidade qualidade;
    private Rastreabilidade rastreabilidade;

    public Alimento (FabricaAbstrata fabrica) {
        this.qualidade = fabrica.createQualidade();
        this.rastreabilidade = fabrica.createRastreabilidade();
    }

    public String emitirQualidade() {return this.qualidade.emitir();}
    public String emitirRastreabilidade() {return this.rastreabilidade.emitir();}
}
