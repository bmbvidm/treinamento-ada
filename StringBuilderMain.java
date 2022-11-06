package br.com.cursoada;

public class StringBuilderMain {

    public static void main(String[] args) {

        StringBuilder nomeSB = new StringBuilder();
        nomeSB.append("Bruna");
        nomeSB.append(" ");
        nomeSB.append("Marcieli");
        nomeSB.append(" ");
        nomeSB.append("Barbosa");

        String nomeStr = nomeSB.toString();

        StringBuilder nomeSb2 = nomeSB;

        nomeSB.append(" Pinheiro");

        System.out.println("nomeStr: " + nomeStr);
        System.out.println("nomeSB: " + nomeSB.toString());
        System.out.println("nomeSB2: " + nomeSb2.toString());

    }
}
