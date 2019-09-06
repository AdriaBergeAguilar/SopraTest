package com.berge.sopra.prueva.caixa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pregunta3Test {

    private final Pregunta3 pregunta3= new Pregunta3();

    @Test
    void addition() {
        assertEquals(pregunta3.funcionResultado(new int[]{1,2,3,4}), 1);
        assertEquals(pregunta3.funcionResultado(new int[]{1,2,4}), 0);

        assertEquals(pregunta3.funcionResultado(new int[]{4,3,2,1}), 1);
        assertEquals(pregunta3.funcionResultado(new int[]{3,1,2}), 1);
    }


}
