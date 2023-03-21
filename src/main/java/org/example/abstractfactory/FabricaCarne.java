package org.example.abstractfactory;

public class FabricaCarne implements FabricaAbstrata {
    @Override
    public Qualidade createQualidade() {return new QualidadeCarne();}

    @Override
    public Rastreabilidade createRastreabilidade() {return new RastreabilidadeCarne();}
}
