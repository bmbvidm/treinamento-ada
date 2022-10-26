package br.com.letscode.turmaitau;

import java.util.Scanner;

public class ConversaoDolar {

    public static void main(String[] args) {

        double cotacaodolar;
        double valorreais;


        System.out.println("Função Calcular a conversão do valor em Dólar para Reais");
        Scanner ent1 = new Scanner(System.in);
        System.out.println("Digite a cotação do dólar (U$$):");
        cotacaodolar = ent1.nextDouble();
        Scanner ent2 = new Scanner(System.in);
        System.out.println("Digite o valor total em dólar:");
        valorreais = ent2.nextDouble();

        calcularConversaoReais(cotacaodolar, valorreais);

    }
    static void calcularConversaoReais(double var1, double var2) {
        double valorreais = var1 * var2;
        System.out.println("Total convertido em Reais: R$ " + valorreais );

    }
}
