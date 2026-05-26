package exerciciosestruturascondicionais;

import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {

        /*  Escreva um programa que leia dois números inteiros e compare-os. mostrando na tela uma mensagem:
                O primeiro valor é maior
                O segundo valor é maior
                Não existe valor maior, os dois são iguais */

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número:");
        int numero1 = sc.nextInt();
        System.out.print("Segundo número:");
        int numero2 = sc.nextInt();

        if(numero1 > numero2){
            System.out.println("O primeiro valor e maior");
        }
        else if(numero2 > numero1){
            System.out.println("O segundo valor e maior");
        }
        else{
            System.out.println("Os valores são iguais");
        }

        sc.close();
    }
}
