package exerciciosestruturascondicionais;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Faça um programa que verifique se um número e PAR ou ÍMPAR */

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é PAR");
        }
        else{
            System.out.println("O número " + numero + " é ÍMPAR");
        }

        sc.close();
    }
}
