package com.calculadora;

import java.util.List;

public class Operacao {

    public static int soma(int numUm, int numDois){
        int resultado = numUm + numDois;
        return resultado;
    }

    public static int soma(List<Integer> numeros){
        int resultado =0;

        for (Integer numero:numeros){
            resultado += numero;
        }
            return resultado;
    }

    public static int subtracao(int numUm, int numDois) {
        int resultado = numUm - numDois;
        return resultado;
    }

    public static int subtracao(List<Integer> numeros){
        int resultado =0;

        for (Integer numero:numeros){
            if (numeros.indexOf(numero) == 0){
                resultado = numero;
            }else{
                resultado -= numero;
            }

        }
        return resultado;
    }

    public static Integer multiplicacao(Integer i, Integer i1) {
        Integer resultado = i * i1;
        return resultado;
    }

    public static Integer multiplicacao(List<Integer> numeros){
        int resultado =1;

        for (Integer numero:numeros){
            resultado *= numero;
        }
        return resultado;
    }

    public static double divisao(Integer i, Integer i1) {
        double resultado = i / i1;
        return resultado;
    }
}
