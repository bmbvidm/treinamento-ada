package br.com.letscode.turmaitau;

import java.util.Arrays;

public class TiposPrimitivosInteiros {

    final static int num3 = 2;

    public static void main(String[] args) {

        short b = 1;
        int numeroInt = 5;
        int num1 = 50;
        int num2 = 25;
        long numeroLong = 6;

        /*
        soma +
        subtracao -
        divisao /
        multiplicacao *
         */

        int soma = numeroInt +10;
        int divisao = (int) (numeroInt / numeroLong);
        System.out.println("Soma = " + soma);
        System.out.println("Divisao = " + divisao);
        somar(10, 20);
        somar(num1, num2);
    }
    static void somar(int var1, int var2) {
        int soma = var1 + var2 + num3;
        System.out.println("Resultado = " + soma);
    }
}
