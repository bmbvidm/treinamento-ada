package br.com.letscode.turmaitau;

import java.util.Arrays;

public class Tabuada {
    public static void main(String[] args) {
        int var1 = 5;

        //System.out.println("Digite um número = " );


        imprimirTabuada(var1);
    }
    static void imprimirTabuada(int var1) {
        System.out.println( var1 +  "x 0 = " + var1 * 0);
        System.out.println( var1 + "x 1 = " + var1 * 1);
        System.out.println( var1 + "x 2 = " + var1 * 2);
        System.out.println( var1 + "x 3 = " + var1 * 3);
        System.out.println( var1 + "x 4 = " + var1 * 4);
        System.out.println( var1 + "x 5 = " + var1 * 5);
        System.out.println( var1 + "x 6 = " + var1 * 6);
        System.out.println( var1 + "x 7 = " + var1 * 7);
        System.out.println( var1 + "x 8 = " + var1 * 8);
        System.out.println( var1 + "x 9 = " + var1 * 9);
        System.out.println( var1 + "x 10 = " + var1 * 10);

    }
}
