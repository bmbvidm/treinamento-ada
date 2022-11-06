package br.com.cursoada.cestaprodutos;

import java.util.Scanner;
import br.com.cursoada.cestaprodutos.enums.TipoPreco;


public class CalcularCestaProdutos {

    public final static int QTDE_MAX_PRODUTO = 5;
    Scanner scanner;
    RecuperarDadosProduto recuperarDadosProduto = null;

    String[] nomesProdutos;
    Double[] precosProdutos;
    Integer  qtdeProdutos;

    public CalcularCestaProdutos () {

        this.scanner = new Scanner (System.in);
        this.recuperarDadosProduto = new RecuperarDadosProduto(scanner);

        this.nomesProdutos = new String[5];
        this.nomesProdutos[0] = "";
        this.nomesProdutos[1] = "";
        this.nomesProdutos[2] = "";
        this.nomesProdutos[3] = "";
        this.nomesProdutos[4] = "";

        this.precosProdutos = new Double[5];
        this.qtdeProdutos = Integer.parseInt("0");

    }

    public void recuperarDadoseCalcular () {

        while (this.qtdeProdutos < QTDE_MAX_PRODUTO) {

            this.nomesProdutos[qtdeProdutos] = recuperarDadosProduto.recuperarNome();
            this.precosProdutos[qtdeProdutos] = recuperarDadosProduto.recuperarPreco();

            System.out.println("Digite X para encerrar ou outra letra para continuar");
            String continuar = this.scanner.next();
            Boolean sair = continuar.equalsIgnoreCase("X");

            qtdeProdutos++;

            if (sair) {
                break;
            }

        }

        this.calcularProdutoMaisCaro();
        this.calcularProdutoMaisBarato();
    }

        public void calcularProdutoMaisCaro (){

            int indexProdutoMaisCaro = 0;

            for (int i=0; i < this.qtdeProdutos; i++) {
                if (this.precosProdutos[i] > this.precosProdutos[indexProdutoMaisCaro]) {
                    indexProdutoMaisCaro = i;
                }
            }

                this.imprimeProduto(indexProdutoMaisCaro, TipoPreco.CARO);

        }

        public void calcularProdutoMaisBarato () {

            int indexProdutoMaisBarato = 0;

            for (int i=0; i < this.qtdeProdutos; i++) {
                if (this.precosProdutos[i] < this.precosProdutos[indexProdutoMaisBarato]) {
                    indexProdutoMaisBarato = i;
                }
            }

                this.imprimeProduto(indexProdutoMaisBarato, TipoPreco.BARATO);

            }

            public void imprimeProduto(int index, TipoPreco tipopreco){
                System.out.printf("Produto mais %s: %s - R$ %.2f \n",
                        tipopreco.name(),
                        this.nomesProdutos[index],
                        this.precosProdutos[index]);
            }



}
