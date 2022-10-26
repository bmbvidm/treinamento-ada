package br.com.letscode.turmaitau;

import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {

        int tempo;
        int velocidade;


        System.out.println("Função Calcular a quantidade de combustível gasto em sua viagem");
        Scanner ent1 = new Scanner(System.in);
        System.out.println("Digite o tempo gasto em sua viagem (em Horas):");
        tempo = ent1.nextInt();
        Scanner ent2 = new Scanner(System.in);
        System.out.println("Digite a sua velocidade média (em KM/H):");
        velocidade = ent2.nextInt();

        System.out.println("Velocidade Média: " + velocidade + " KM/H");
        System.out.println("Tempo Gasto na viagem: " + tempo + " horas");


        calcularLitros(tempo, velocidade);

    }
    static void calcularLitros(int var1, int var2) {
        int distancia = var1 * var2;
        System.out.println("Distância percorrida:" + distancia + " Km");
        int litros = distancia/12;
        System.out.println("Quantidade de Litros Utilizados: " + litros + " litros");
    }

    }
