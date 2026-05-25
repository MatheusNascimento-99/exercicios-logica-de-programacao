package exerciciosestruturasrepeticaofor;

import java.util.Scanner;

public class SomaDosPares {
    public static void main(String[] args) {

        /*Desenvolva um programa que leia seis números inteiros e mostre a soma apenas daqueles que forem pares.
         Se o valor digitado for ímpar, desconsidere-o.
         */


        Scanner sc = new Scanner(System.in);

        int somaPar = 0;
        int contPar = 0;

        for(int i = 1; i <= 6; i++){
            System.out.print("Digite o "+i+"º valor:");
            int numero = sc.nextInt();
            if(numero % 2 == 0){
                contPar++;
                somaPar += numero;
            }
        }
        System.out.println("A soma dos " + contPar + " valores solicitados foi: " + somaPar);

        sc.close();


    }
}
