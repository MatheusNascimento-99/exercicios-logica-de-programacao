package exerciciosestruturascondicionais;

import java.util.Scanner;
import java.util.Random;


public class AdvinheONumero {

    public static void main(String[] args) {

        /* Crie um programa que simule um jogo de adivinhação de um número entre 0 e 5 */


        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(0,6);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Vou pensar em um número entre 0 e 5 tente adivinhar");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Em que número eu pensei?");
        int palpite = sc.nextInt();

        if(palpite == numeroSecreto){
            System.out.println("Parabéns você acertou !");
        }
        else{
            System.out.println("Você errou, eu pensei no número " + numeroSecreto );
        }

        sc.close();



    }
}
