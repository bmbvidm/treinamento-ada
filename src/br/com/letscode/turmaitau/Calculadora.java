package br.com.letscode.turmaitau;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner ent1 = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1 = ent1.nextInt();
        Scanner ent2 = new Scanner(System.in);
        System.out.println("Digite o segundo número:");
        num2 = ent1.nextInt();

        somar(num1, num2);
        subtrair(num1, num2);
        multiplicar(num1, num2);
        dividir(num1, num2);
    }
    static void somar(int var1, int var2) {
        int soma = var1 + var2;
        System.out.println("Soma = " + soma);
    }

    static void subtrair(int var1, int var2) {
        int subtrair = var1 - var2;
        System.out.println("Subtração = " + subtrair);
    }


    static void multiplicar(int var1, int var2) {
        int multiplicacao = var1 * var2;
        System.out.println("multiplicacao = " + multiplicacao);
    }


    static void dividir(int var1, int var2) {
        int divisao = var1 + var2;
        System.out.println("Divisão = " + divisao);
    }
}
