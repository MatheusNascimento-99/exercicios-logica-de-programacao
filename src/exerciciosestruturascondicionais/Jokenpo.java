package exerciciosestruturascondicionais;

import java.util.Scanner;
import java.util.Random;

public class Jokenpo {
    public static void main(String[] args) {

        /* Crie um programa que faça o computador jogar Jokenpô com você.*/

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("""
                Suas opções:
                [ 0 ] PEDRA
                [ 1 ] PAPEL
                [ 2 ] TESOURA
                Qual é a sua jogada?""");
        int jogada = sc.nextInt();
        int computador = random.nextInt(0,3);
        String opcoes = "";
        String jogador = "";

        System.out.println("JO");
        System.out.println("KEN");
        System.out.println("PO!!!");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
        if(computador == 0){
            opcoes = "Pedra";
        }
        else if(computador == 1){
            opcoes = "Papel";
        }
        else{
            opcoes = "Tesoura";
        }
        if(jogada == 0){
            jogador = "Pedra";
        }
        else if(jogada == 1){
            jogador = "Papel";
        }
        else if(jogada == 2){
            jogador = "Tesoura";
        }
        else{
            jogador = "Jogada inválida";

        }
        System.out.println("Computador jogou " + opcoes);
        System.out.println("Jogador jogou " + jogador);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");

        if(computador == 0 && jogada == 0){
            System.out.println("EMPATE");
        }
        else if(computador == 0 && jogada == 1){
            System.out.println("JOGADOR VENCE");
        }
        else if(computador == 0 && jogada == 2){
            System.out.println("COMPUTADOR VENCE");
        }
        else if(computador == 1 && jogada == 0){
            System.out.println("COMPUTADOR VENCE");
        }
        else if(computador == 1 && jogada == 1){
            System.out.println("EMPATE");
        }
        else if(computador == 1 && jogada == 2){
            System.out.println("JOGADOR VENCE");
        }
        else if(computador == 2 && jogada == 0){
            System.out.println("JOGADOR VENCE");
        }
        else if(computador == 2 && jogada == 1){
            System.out.println("COMPUTADOR VENCE");
        }
        else if(computador == 2 && jogada == 2){
            System.out.println("EMPATE");
        }
        else{
            System.out.println("JOGADOR FEZ UMA JOGADA INVÁLIDA!");
            System.out.println("COMPUTADOR VENCE");
        }

        sc.close();



    }
}
