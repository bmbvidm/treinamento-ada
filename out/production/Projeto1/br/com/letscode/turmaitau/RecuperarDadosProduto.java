package br.com.cursoada.cestaprodutos;

import java.util.Scanner;

public class RecuperarDadosProduto {

    Scanner entrada = null;

    public RecuperarDadosProduto(Scanner entrada){
        this.entrada = entrada;
    }

    public String recuperarNome (){
        System.out.println ("Digite o nome do produto: ");
        String nome = entrada.next();
        return nome;
    }

    public Double recuperarPreco (){
        System.out.println ("Digite o valor do produto: ");
        Double preco = entrada.nextDouble();
        return preco;
    }
}
