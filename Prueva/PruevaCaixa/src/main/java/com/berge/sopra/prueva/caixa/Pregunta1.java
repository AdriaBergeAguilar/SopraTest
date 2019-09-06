package com.berge.sopra.prueva.caixa;

import java.util.ArrayList;
import java.util.List;

public class Pregunta1 {

    public List<Integer> factoritzacio(int num) {
        int divisor = num;

        List<Integer> list = new ArrayList<>();

        while (divisor != 0) {
            if (num % divisor == 0) {
                list.add(divisor);

            }
            divisor = divisor - (num > 0 ? 1 : -1);
        }
        return list;
    }

    public int funcionResultado(int num){
        int sum = 0;
        for(Integer d : factoritzacio(num))
            sum += d;
        return sum;
    }

}
