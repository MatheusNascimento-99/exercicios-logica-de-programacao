package exerciciosestruturascondicionais;

import java.util.Scanner;

public class CustoViagem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Desenvolva um programa que pergunte a distância de uma viagem em Km.
           Calcule o preço da passagem, cobrando R$0.50 por Km para viagens até 200km
           e R$0.45 para viagens mais longas.
         */

        double preco;
        System.out.println("Qual é a ditância da sua viagem?");
        int distancia = sc.nextInt();
        System.out.println("Você está prestes a começar uma viagem de " +distancia+ "Km.");
        if(distancia > 200){
            preco = distancia * 0.45;
        }
        else{
            preco = distancia * 0.50;
        }
        System.out.printf("E o preço da sua passagem será de R$%.2f%n",preco);

        sc.close();

    }
}
