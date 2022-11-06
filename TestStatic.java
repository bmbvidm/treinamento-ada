package br.com.cursoada;

import br.com.cursoada.utils.ImprimirString;

public class TestStatic {

    public static String mensagem = "";
    public static void main(String[] args) {

        TestStatic testStatic = new TestStatic();
        testStatic.mensagem = "msg1";

        TestStatic testStatic1 = new TestStatic();
        testStatic1.mensagem = "msg2";

        TestStatic.mensagem = "msg3";

        ImprimirString.imprimir(testStatic.mensagem);
        ImprimirString.imprimir(testStatic1.mensagem);
        ImprimirString.adicionarDataHora(testStatic1.mensagem);



    }

    private String getMensagem () {
        return "Ola mundo!";
    }
}
