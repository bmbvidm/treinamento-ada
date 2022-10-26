package cestadeprodutos;

import java.util.Iterator;
import java.util.Scanner;

import java.util.ArrayList;

public class ProdutosMain {

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        ArrayList<String> listaProdutos  = new ArrayList();
        ArrayList<Float> listaPrecos  = new ArrayList();

        int continua;
        int qtdeProdutos = 0;

        do  {
            System.out.println("Digite o produto a ser cadastrado: ");
            String produto = input.next();
            listaProdutos.add(produto);
            System.out.println("Digite o preço do produto a ser cadastrado: ");
            Float preco = input.nextFloat();
            listaPrecos.add(preco);
            qtdeProdutos++;
            System.out.println("Deseja continuar (1 - Sim/ 2 - Não): ");
            continua = input.nextInt();

        } while (continua == 1);


            System.out.println("Lista de Produtos : " + listaProdutos.toString());
            System.out.println("Lista de Preços   : " + listaPrecos.toString());

        Iterator listIterator = listaPrecos.iterator();
        float maiorPreco = 0;
        float maiscaro = 0;
        while (listIterator.hasNext()) {
            Float num = (Float) listIterator.next();
            System.out.println ("num: " + num);

            if (num  > maiorPreco)
                maiorPreco = num;

        }

        System.out.println ("O valor mais CARO é: " + maiorPreco);

        Iterator listIterator2 = listaPrecos.iterator();
        float menorPreco = 999;
        float maisbarato = 0;
        while (listIterator2.hasNext()) {
            Float num2 = (Float) listIterator.next();
            System.out.println ("num2: " + num2);

            if (num2  < menorPreco)
                menorPreco = num2;

        }

        System.out.println ("O valor mais BARATO é: " + menorPreco);




    }
}
