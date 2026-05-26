package exerciciosestruturasrepeticaofor;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        /*Faça um programa que leia um número inteiro e diga se ele é ou não um número primo.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número:");

        int numero = sc.nextInt();
        int contaDivisores = 0;
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                contaDivisores++;
            }
        }
        System.out.println("O número " + numero + " foi divisível " + contaDivisores + " vezes");
        if(contaDivisores == 2){
            System.out.println("E por isso ele É PRIMO!");
        }
        else{
            System.out.println("E por isso ele NÃO É PRIMO!");
        }

        sc.close();
    }
}
