package org.example.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlimentoTest {

    @Test
    void deveEmitirQualidadeCarne() {
        FabricaAbstrata fabrica = new FabricaCarne();
        Alimento alimento = new Alimento(fabrica);
        assertEquals("Certificação de qualidade da carne", alimento.emitirQualidade());
    }

    @Test
    void deveEmitirRastreabilidadeCarne() {
        FabricaAbstrata fabrica = new FabricaCarne();
        Alimento alimento = new Alimento(fabrica);
        assertEquals("Certificação de rastreabilidade da carne", alimento.emitirRastreabilidade());
    }

    @Test
    void deveEmitirQualidadeLeite() {
        FabricaAbstrata fabrica = new FabricaLeite();
        Alimento alimento = new Alimento(fabrica);
        assertEquals("Certificação de qualidade do leite", alimento.emitirQualidade());
    }

    @Test
    void deveEmitirRastreabilidadeLeite() {
        FabricaAbstrata fabrica = new FabricaLeite();
        Alimento alimento = new Alimento(fabrica);
        assertEquals("Certificação de rastreabilidade do leite", alimento.emitirRastreabilidade());
    }

}