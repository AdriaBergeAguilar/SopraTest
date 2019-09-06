package com.berge.sopra.prueva.caixa;

import java.util.ArrayList;
import java.util.List;

public class Pregunta2 {

    public String numToBinary(int num){
        String binario = "";

        if (num > 0) {
            while (num > 0) {
                if (num % 2 == 0) {
                    binario = "0" + binario;
                } else {
                    binario = "1" + binario;
                }
                num = (int) num / 2;
            }
        }
        return binario;
    }

    public int maxTuple(List<Integer> list){

        if(list.size() > 1){
            int max = 0;
            for(int i = 0; i != list.size()-1; i++){

                int num1 = list.get(i);
                int num2 = list.get(i + 1);
                int count = countNumBetwen(num1, num2);
                if (count > max) {
                    max = count;
                }
            }
            return max;
        }else {
            return 0;
        }
    }

    public int countNumBetwen(int num1, int num2){
        return num2 - num1 - 1;
    }

    public int funcionResultado(int num) {
        String numBinary = numToBinary(num);
        List<Integer> list = new ArrayList<>();

        int index = 0;
        while (index < numBinary.length()){
            int indexNext = numBinary.indexOf("1", index);
            if(indexNext >= 0){
                list.add(indexNext);
                index = indexNext+1;
            }else{
                index = numBinary.length();
            }
        }

        return maxTuple(list);
    }
}
