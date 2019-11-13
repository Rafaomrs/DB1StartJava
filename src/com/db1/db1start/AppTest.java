package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    Application application = new Application();
    //Classe para teste unitátio.
    @Test
    public void deveRetornar5(){
        Integer expected = 5;
        Integer response = application.soma(2,3);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornar8(){
        Integer expected = 8;
        Integer response = application.soma(5,3);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornar10(){
        Integer expected = 10;
        Integer response = application.multiplicacao(5,2);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornarSeNumeroEPar(){
        Boolean expected = true;
        Boolean response = application.par(10);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveSerMaior(){
        Integer expected = 10;
        Integer response = application.maior(10,2);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveTer5Impar(){
        Integer expected = 5;
        Integer response = application.quantidadeImpar(10);
        Assert.assertEquals(expected, response);
    }
    //DESAFIO!!!!
//    @Test
//    public void deveContarImpares(){
//        Application application = new Application();
//        Integer expected = 5;
//        Integer response = application.quantImpar(10);
//        Assert.assertEquals(expected, response);
//
//    }

    //Teste de Strings
        @Test
    public void deveMostrarLetrasMaiusculas(){
        String expected = "RAFAEL";
        String response = application.maiuscula("rafael");
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveMostrarLetrasMinusculas(){
        String expected = "rafael";
        String response = application.minuscula("RAFAEL");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveMostrarQuantidadeLetras(){
        int quantidade = application.quantidadeLetra();
        Assert.assertEquals(7, quantidade);
    }

    @Test
    public void deveMostrarQuantidadeLetrasComEspaco(){
        Integer expected = 8;
        Integer response = application.quantidadeLetraComEspaco(" DB1START ");
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveMostrar4PrimeirasLetrasDoNome(){
        String expected = "rafa";
        String response = application.quatroPrimeirasLetrasDoNome("rafael");
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveMostrarApos3LetraDoNome(){
        String expected = "fael";
        String response = application.retornarLetrasApos3Letra("Rafael");
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveMostrar4UltimasLetrasDoNome(){
        String expected = "rais";
        String response = application.retorna4UltimasLetras("Rafael Morais");
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveTrocarPrimeiroNomePorAluno(){
        String expected = "Aluno Morais";
        String response = application.retornaAluno("Rafael Morais");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarSequenciaDeLetrasSeparadas(){
        String[] expected = new String[]{"banana", "maca", "melancia"};
        String[] response = application.textoSeparado("banana, maca, melancia");
        Assert.assertEquals(expected, response);

    }
    @Test
    public void deveMostrarQuantasVogaisTem(){
        Integer expected = 1;
        Integer response = application.contarVogal("DB1START");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveMostrarTextoInvertido(){
        String expected = "leafar";
        String response = application.inverterTexto("rafael");
        Assert.assertEquals(expected, response);
    }

    // Testes de Matemática
    @Test
    public void deveMostrarMenorValor(){
        Double expected = 13.5;
        Double response = application.menorValor(13.5, 15.4);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveMostrarOMenorValorEntre3(){
        Double expected = 9.4;
        Double response = application.menorValorEntre3(13.4, 14.6, 9.4);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveMostrarAMediaDe3Numeros(){
        Integer expected = 5;
        Integer response = application.media(5, 6, 4);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveMostrarAreaDoTriangulo(){
        Integer expected = 50;
        Integer response = application.areaDoTriangulo(10, 2);
        Assert.assertEquals(expected, response);
    }
}
