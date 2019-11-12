package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    //Classe para teste unitátio.
    @Test
    public void deveRetornar5(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.soma(2,3);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornar8(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.soma(5,3);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornar10(){
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.multiplicacao(5,2);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornarSeNumeroEPar(){
        Application application = new Application();
        Boolean expected = true;
        Boolean response = application.par(10);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveSerMaior(){
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.maior(10,2);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveTer5Impar(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.quantidadeImpar(10);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveMostrarLetrasMaiusculas(){
        Application application = new Application();
        String expected = "RAFAEL";
        String response = application.maiuscula("rafael");
        Assert.assertEquals(expected, response);
    }


}
