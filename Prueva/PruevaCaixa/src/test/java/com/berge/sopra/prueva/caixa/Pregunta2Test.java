package com.berge.sopra.prueva.caixa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pregunta2Test {

    private final Pregunta2 pregunta2 = new Pregunta2();

    @Test
    void addition() {
        assertEquals(pregunta2.funcionResultado(9), 2);
        assertEquals(pregunta2.funcionResultado(529), 4);
        assertEquals(pregunta2.funcionResultado(20), 1);
        assertEquals(pregunta2.funcionResultado(15), 0);
        assertEquals(pregunta2.funcionResultado(32), 0);
        assertEquals(pregunta2.funcionResultado(1041), 5);
    }


}
