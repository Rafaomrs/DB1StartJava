package com.db1.db1start;

import java.util.Scanner;

public class App {
    public String nomePessoa;

    //Metodos numéricos.
    public static String soma(Integer numero1, Integer numero2){
        Integer resultado;
        resultado = numero1 + numero2;
        return "O resultado é: " + resultado;
    }
    public static Integer subtrair(Integer numero1, Integer numero2){
        return numero1 - numero2;
    }
    public static Integer multiplicacao(Integer numero1,Integer numero2){
        return numero1 * numero2;
    }
    public static Integer divisao(Integer num1, Integer num2){
        return num1 / num2;
    }


    //Métodos com Strings
    public static String upperCase(String texto){
        return texto.toUpperCase();
    }

    public static String lowerCase(String texto){
        return texto.toLowerCase();
    }
    public static Double menor(Double valor1, Double valor2){
        if (valor1 < valor2){
            return valor1;
        }
           return valor2;

    }
    public static Double menor(Double valor1, Double valor2, Double valor3){
        return menor(menor(valor1, valor2),valor3);
    }

    public static void main(String[] args){
        /* Metodo main é necessario para que o Java consiga entender.
         public - palavra reservada que diz a classe ser publica e de possivel acesso.
         static - o metodo não precisa de instancia/criar objeto na memoria, para executar.
         void - significa fechado e que não retornara nenhuma informação.
         */
        Scanner scan = new Scanner(System.in);

        //Soma
//        System.out.println("Primeiro exercicio");
//
//        System.out.println("Insira o primeiro valor");
//        Integer numero1 = scan.nextInt();
//        scan.nextLine();
//        System.out.println("Insira o Segundo valor");
//        Integer numero2 = scan.nextInt();
//        scan.nextLine();
//        String result = soma(numero1, numero2);
//        System.out.println(result);

//        System.out.println();

        //Subtração
//        System.out.println("Segundo exercicio");
//        System.out.println("Insira o primeiro valor");
//        numero1 = scan.nextInt();
//        scan.nextLine();
//        System.out.println("Insira o Segundo valor");
//        numero2 = scan.nextInt();
//        scan.nextLine();
//        System.out.println(subtrair(numero1, numero2));

//        System.out.println();

        //UpperCase e LowerCase
        /*System.out.println("Terceiro exercicio");
        String textoMinusculo;
        System.out.println("Insira um texto!");
        textoMinusculo = scan.next();
        System.out.println("Texto com LETRAS MAIUSCULAS");
        System.out.println(textoMinusculo.toUpperCase());                           1ª Opção!!
        String textoMaiusculo;
        System.out.println("Insira um texto!");
        textoMaiusculo = scan.next();
        System.out.println("Texto com letras minusculas!");
        System.out.println(textoMaiusculo.toLowerCase()); */


//        String texto = scan.next();
//        System.out.println(upperCase(texto));
//        System.out.println(lowerCase(texto));
//                                                                                    /* 2ª Opção!! */

//        System.out.println();


        //Menor valor com 2 parametros.
//        System.out.println("Quarto exercicio");
//
//        System.out.println("Insira o Primeiro valor!");
//        Double v1 = scan.nextDouble();
//        scan.nextLine();
//        System.out.println("Insira o Segundo valor");
//        Double v2 = scan.nextDouble();
//        scan.nextLine();
//        System.out.println(menor(v1, v2));


//        System.out.println();

        //Menor valor com 3 parametros.
//        System.out.println("Quinto exercicio");
//        Double num1, num2, num3;
//        System.out.println("Insira o Primeiro valor!");
//        num1 = scan.nextDouble();
//        scan.nextLine();
//        System.out.println("Insira o Segundo valor!");
//        num2 = scan.nextDouble();
//        scan.nextLine();
//        System.out.println("Insira o Terceiro valor!");
//        num3 = scan.nextDouble();
//        scan.nextLine();
//        System.out.println(menor(num1, num2, num3));



        // ----------------------------------------------------------------------------------------------------------//
        // PILHA DE EXERCÍCIOS FASE 2!!!! //
        // ----------------------------------------------------------------------------------------------------------//

        //Multiplicação
//        System.out.println("Insira dois valores!");
//        Integer num1 = scan.nextInt();
//        scan.nextLine();
//        Integer num2 = scan.nextInt();
//        scan.nextLine();
//        System.out.println(multiplicacao(num1, num2));


        //Divisão
//        System.out.println("Insira dois valores!");
//        Integer num1 = scan.nextInt();
//        scan.nextLine();
//        Integer num2 = scan.nextInt();
//        scan.nextLine();
//        System.out.println(divisao(num1, num2));

        //Dizer se o número é par



    }


}
