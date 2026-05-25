package exerciciosestruturascondicionais;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Faça um programa que peça um ano qualquer e diga se ele e bissexto ou não */

        System.out.println("Qual ano gostaria de analisar?");
        int ano = sc.nextInt();

        if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            System.out.println("O ano " + ano + " È BISSEXTO");
        }
        else{
            System.out.println("O ano " + ano + " NÃO É BISSEXTO");
        }

        sc.close();
    }
}
