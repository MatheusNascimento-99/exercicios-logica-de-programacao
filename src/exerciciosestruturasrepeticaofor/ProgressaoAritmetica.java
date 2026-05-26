package exerciciosestruturasrepeticaofor;

import java.util.Scanner;

public class ProgressaoAritmetica {
    public static void main(String[] args) {

        /*Desenvolva um programa que leia o primeiro termo e a razão de uma PA. No final, mostre os 10 primeiros termos dessa progressão.*/


        Scanner sc = new Scanner(System.in);

        System.out.println("GERADOR DE PA");
        System.out.println("=-=-=-=-=-=-=-=");

        System.out.print("Primeiro termo:");
        int termo = sc.nextInt();
        System.out.print("Razão:");
        int razao = sc.nextInt();
        System.out.print(termo + " » ");
        for(int i = termo; i<=10; i++){
            termo+=razao;
            System.out.print(termo + " » ");
        }
        System.out.print("FIM");

        sc.close();
    }
}
