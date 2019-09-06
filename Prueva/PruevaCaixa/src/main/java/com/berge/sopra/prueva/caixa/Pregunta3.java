package com.berge.sopra.prueva.caixa;

import java.util.Arrays;

public class Pregunta3 {

    public int funcionResultado(int[] args) {
        Arrays.sort(args);

        int last = args[0];
        for(int i = 1; i != args.length; i++){
            int num = args[i];
            if(last+1 != num){
                return 0;
            }else{
                last = num;
            }
        }
        return 1;
    }

}
