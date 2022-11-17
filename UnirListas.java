package ExercícioLista;

import java.util.*;

public class UnirListas {

    public static void main(String[] args) {

        List lista1 = criarLista1();
        List lista2 = criarLista2();

        unirLista(lista1, lista2);


    }

    public static List criarLista1() {
        String lista1 = "1,2,3,4";
        List lista = Arrays.asList(lista1.split(","));
        return lista;

    }

    public static List criarLista2() {
        String lista2 = "2,5";
        List lista = Arrays.asList(lista2.split(","));
        return lista;

    }

    private static void unirLista(List<String> lista1, List<String> lista2) {
        HashSet<String> listaunida = new HashSet<String>();
        List<String> listadecrescente = new ArrayList<>();
        listaunida.addAll(lista1);
        listaunida.addAll(lista2);

        System.out.println("-------------------------------------------------------------");
        System.out.println("1ª Lista: " + lista1);
        System.out.println("2ª Lista: " + lista2);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Resultado das listas unidas: " + listaunida);

        listadecrescente.addAll(listaunida);
        Collections.reverse(listadecrescente);

        System.out.println("-------------------------------------------------------------");
        System.out.println("Resultado da lista decrescente e sem duplicidade: " + listadecrescente);
        System.out.println("-------------------------------------------------------------");


    }
}



