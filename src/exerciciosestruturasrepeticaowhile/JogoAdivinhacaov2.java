package exerciciosestruturasrepeticaowhile;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacaov2 {
    public static void main(String[] args) {

        /* Melhore o jogo do DESAFIO 028 onde o computador vai "pensar" em um número entre 0 e 10.
           Só que agora o jogador vai tentar adivinhar até acertar, mostrando no final quantos palpites foram necessários para vencer.
         */

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(0,11);

        System.out.println("Estou pensando em um número entre 0 e 10 tente adivinhar!");
        System.out.print("Em que número eu pensei?");
        int palpite = sc.nextInt();
        int tentativas = 1;
        while(palpite != numeroSecreto){
            if(palpite > numeroSecreto){
                System.out.println("Menos.. tente novamente.");
                System.out.print("Qual é o seu palpite?");
                palpite = sc.nextInt();
            }
            else{
                System.out.println("Mais.. tente novamente.");
                System.out.print("Qual é o seu palpite?");
                palpite = sc.nextInt();
            }
            tentativas++;
        }
        System.out.println("Acertou com " + tentativas + " tentativas");

        sc.close();
    }
}
