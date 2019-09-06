package com.berge.sopra.prueva.caixa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pregunta1Test {

    private final Pregunta1 pregunta1 = new Pregunta1();

    @Test
    void addition() {
        assertEquals(pregunta1.funcionResultado(24), 60);
        assertEquals(pregunta1.funcionResultado(0), 0);
        assertEquals(pregunta1.funcionResultado(-24), -60);
    }


}
