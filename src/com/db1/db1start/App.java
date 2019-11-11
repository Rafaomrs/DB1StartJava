package com.db1.db1start;

import java.util.Scanner;

public class App {
    public String nomePessoa;

    public static void main(String[] args){
        /* Metodo main é necessario para que o Java consiga entender.
         public - palavra reservada que diz a classe ser publica e de possivel acesso.
         static - o metodo não precisa de instancia/criar objeto na memoria.
         void - significa fechado e que não retornara nenhuma informação.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro exercicio");
        Integer numero1, numero2, resultado;
        System.out.println("Insira o primeiro valor");
        numero1 = scan.nextInt();
        System.out.println("Insira o Segundo valor");
        numero2 = scan.nextInt();
        resultado = numero1 + numero2;

        System.out.printf("A soma dos numeros é: "+ resultado);

        System.out.println();

        System.out.println("Segundo exercicio");
        System.out.println("Insira o primeiro valor");
        numero1 = scan.nextInt();
        System.out.println("Insira o Segundo valor");
        numero2 = scan.nextInt();

        resultado = numero1 - numero2;

        System.out.printf("A subtração dos valores é: " + resultado);

        System.out.println();

        System.out.println("Terceiro exercicio");

        /*String textoMinusculo;
        System.out.println("Insira um texto!");
        textoMinusculo = scan.next();
        System.out.println("Texto com LETRAS MAIUSCULAS");
        System.out.println(textoMinusculo.toUpperCase());                           1ª Opção!!
        String textoMaiusculo;
        System.out.println("Insira um texto!");
        textoMaiusculo = scan.next();
        System.out.println("Texto com letras minusculas!");
        System.out.println(textoMaiusculo.toLowerCase()); */

        String textoNormal = scan.next();

        String textoMinusculo = textoNormal.toLowerCase();
        String textoMaiusculo = textoNormal.toUpperCase();

        System.out.println("Texto Normal: " + textoNormal);
        System.out.println("Texto Maiusculo: " + textoMaiusculo);                     /* 2ª Opção!! */
        System.out.println("Texto Minusculo: " + textoMinusculo);

        System.out.println();

        System.out.println("Quarto exercicio");
        Double valor1, valor2;
        System.out.println("Insira o Primeiro valor!");
        valor1 = scan.nextDouble();
        System.out.println("Insira o Segundo valor");
        valor2 = scan.nextDouble();

        if (valor1 < valor2) {
            System.out.printf("O numero menor é: " + valor1);
        }
        else{
            System.out.printf("O numero menor é: " + valor2);
        }

        System.out.println();

        System.out.println("Quinto exercicio");
        Double num1, num2, num3;
        System.out.println("Insira o Primeiro valor!");
        num1 = scan.nextDouble();
        System.out.println("Insira o Segundo valor!");
        num2 = scan.nextDouble();
        System.out.println("Insira o Terceiro valor!");
        num3 = scan.nextDouble();

        if (num1 < num2 && num1 < num3){
            System.out.printf("O menor numero é: " + num1);
        }else if (num2 < num1 && num2 < num3){
            System.out.printf("O menor numero é: " + num2);
        }else{
            System.out.printf("O menor numero é: " + num3);
        }


    }
}
