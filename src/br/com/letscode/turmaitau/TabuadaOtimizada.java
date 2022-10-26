package br.com.letscode.turmaitau;

import java.util.Scanner;

public class TabuadaOtimizada {

    public static void main(String[] args) {

        int entrada;
        // comando para receber dados da tela/usuário Scanner
        Scanner ent = new Scanner(System.in);
        System.out.print("Informar um número: ");
        entrada = ent.nextInt();
        System.out.println("Tabuada do " + entrada);

            int multiplicador = 0;
            while (multiplicador <= 10)
            {
                int resultado = entrada * multiplicador;
                System.out.println(entrada + "x" + multiplicador + "=" + resultado);
                multiplicador ++;
            }
        }

}
