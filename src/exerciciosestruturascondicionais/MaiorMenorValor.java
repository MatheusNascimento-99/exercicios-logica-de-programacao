package exerciciosestruturascondicionais;

import java.util.Scanner;

public class MaiorMenorValor {
    public static void main(String[] args) {

        /*Faça um programa que leia três números e mostre qual é o maior e qual é o menor.

         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor:");
        int valor1 = sc.nextInt();
        System.out.print("Segundo valor:");
        int valor2 = sc.nextInt();
        System.out.print("Terceiro valor:");
        int valor3 = sc.nextInt();

        int maiorValor = valor1;
        int menorValor = valor1;

        if(valor2 > maiorValor && valor2 > valor3){
            maiorValor = valor2;
        }
        if(valor3 > maiorValor && valor3 > valor2){
            maiorValor = valor3;
        }
        if(valor2 < menorValor && valor2 < valor3){
            menorValor = valor2;
        }
        if(valor3 < menorValor && valor3 < valor2){
            menorValor = valor3;
        }

        System.out.println("O MENOR valor digitado foi " + menorValor);
        System.out.println("O MAIOR valor digitado foi " + maiorValor);

        sc.close();

    }
}
