package com.db1.db1start;

public class Application {
    public Integer soma(Integer numero1, Integer numero2){
        return numero1 + numero2;
    }
    public Integer multiplicacao(Integer numero1,Integer numero2) {
        return numero1 * numero2;
    }
    public Integer divisao(Integer numero1,Integer numero2) {
        return numero1 / numero2;
    }
    public Boolean par(Integer numero1) {
        if (numero1 % 2  == 0){
            return true;
        }
        return false;
    }
    public Integer maior(Integer num1,Integer num2){
        if (num1 > num2){
            return num1;
        }
        return num2;
    }
    public Integer quantidadeImpar(Integer num1){
        Integer numImpar = 0;
        for (Integer i=0; i<num1; i++ ){
            if (i % 2 != 0){
                numImpar++;
            }
        }
        return numImpar;
    }

    //MÉTODOS DE STRINGS
    public String maiuscula(String text){
        return text = text.toUpperCase();
    }
    
}
