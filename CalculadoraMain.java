package br.com.cursoada;

import br.com.cursoada.operacoes.*;


import java.util.Scanner;

public class CalculadoraMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o PRIMEIRO número: ");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite o SEGUNDO número: ");
        double numero2 = entrada.nextDouble();

        System.out.println("Digite a Operação Desejada: ");
        System.out.println("+ Somar, - Subtrair, * Multiplicar, / Dividir, t Tabuada");

        String operador = entrada.next();

        switch (operador) {
            case "+":
                new Somar().realizarOperacao(numero1, numero2);
                break;
            case "-":
                new Subtrair().realizarOperacao(numero1, numero2);
                break;
            case "*":
                new Multiplicar().realizarOperacao(numero1, numero2);
                break;
            case "/":
                new Dividir().realizarOperacao(numero1, numero2);
                break;
            case "t":
                new Tabuada().realizarOperacao(numero1, numero2);
                break;
            default:
                System.out.println("Operacao Invalida!!!");
                break;
        }

    }
}
