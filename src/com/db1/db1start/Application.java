package com.db1.db1start;

import java.util.Arrays;

public class
Application {
    //MÉTODOS INTEGER
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
    //DESAFIO!!!
//    public Integer quantImpar (Integer num1){
//        if(num1 % 2 == 0){
//            num1 = num1 / 2 ;
//            return num1;
//        }
//        return num1 = (num1 / 2) + 1;
//    }

    //MÉTODOS DE STRINGS
    public String maiuscula(String text){
        return text = text.toUpperCase();
    }
    public String minuscula(String text){
        return text = text.toLowerCase();
    }

    public Integer quantidadeLetra(){
        String text = "DB1Start";
        return removeNumeroDoString(text).length();

    }
    private String removeNumeroDoString(String text){
        return text.replaceAll("[0-9]", "");
    }

    public Integer quantidadeLetraComEspaco(String text){
        String textoSemEspaco = text.replaceAll(" ", "");
        Integer quantidadeSemEspaco = textoSemEspaco.length();
        return quantidadeSemEspaco;
    }
    public String quatroPrimeirasLetrasDoNome(String nome){
        return nome = nome.substring(0,4);
    }
    public String retornarLetrasApos3Letra(String nome){
        String letras;
        return letras = nome.substring(2);
    }
    public String retorna4UltimasLetras(String nome){
        String letras;
        return letras = nome.substring(9,13);
    }

    public String retornaAluno(String nome){
        int posicaoPrimeiroEspaco = nome.indexOf(" ");
        return "Aluno" + nome.substring(posicaoPrimeiroEspaco);

    }

    public String[] textoSeparado(String texto){
       return texto.split(", ");
    }

    public Integer contarVogal(String texto){
        return texto.trim().replace(" ", "")
                .toUpperCase()
                .replaceAll("[^AEIOU]", "")
                .length();
    }

    public String inverterTexto(String texto){
        String textoInvertido = new StringBuilder(texto).reverse().toString();
        return textoInvertido;
    }

    //MÉTODOS DE MATEMATICA
    public Double menorValor(Double valor1, Double valor2){
        if (valor1 < valor2){
            return valor1;
        }
        return valor2;
    }
    public Double menorValorEntre3(Double valor1, Double valor2, Double valor3){
        return menorValor(menorValor(valor1, valor2),valor3);
    }
    public Integer media(Integer num1, Integer num2, Integer num3){
        num1 = (num1 + num2 + num3) / 3;
        return num1;
    }
    public Integer areaDoTriangulo(Integer base, Integer alt){
        alt = 2;
        Integer area = (base*base) / alt;
        return area;
    }
}
