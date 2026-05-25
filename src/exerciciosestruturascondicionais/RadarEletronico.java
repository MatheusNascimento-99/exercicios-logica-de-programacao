package exerciciosestruturascondicionais;

import java.util.Scanner;

public class RadarEletronico {

    public static void main(String[] args) {

        /* Crie um programa que leia a velocidade de um carro. Se ele ultrapassar 80km/h, mostre uma mensagem
           dizendo que ele foi multado. A multa vai custa R$7.00 por cada Km acima do limite.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a velocidade do carro?");
        int velocidade = sc.nextInt();

        if(velocidade > 80){
            double multa = (velocidade - 80) * 7;
            System.out.println("MULTADO! Você excedeu o limite permitido que é de 80Km/h");
            System.out.printf("Você deve pagar uma multa de R$%.2f!%n",multa);
            System.out.println("Tenha um bom dia! Dirija com segurança!");
        }
        else{
            System.out.println("Tenha um bom dia! Dirija com segurança!");
        }

        sc.close();
    }
}
