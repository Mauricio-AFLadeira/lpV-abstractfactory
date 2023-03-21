package org.example.abstractfactory;

public class FabricaLeite implements FabricaAbstrata {
    @Override
    public Qualidade createQualidade() {return new QualidadeLeite();}

    @Override
    public Rastreabilidade createRastreabilidade() {return new RastreabilidadeLeite();}
}
