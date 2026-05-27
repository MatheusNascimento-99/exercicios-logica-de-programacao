package exerciciosestruturasrepeticaofor;

import java.util.Scanner;
import java.util.Locale;

public class MaiorMenorPeso {
    public static void main(String[] args) {

        /* Faça um programa que leia o peso de cinco pessoas. No final, mostre qual foi o maior e o menor peso lidos.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double maiorPeso = 0;
        double menorPeso = 0;
        for(int i = 1; i <= 5; i++ ){
            System.out.print("Peso da " + i + "ª pessoa:");
            double peso = sc.nextDouble();
            if(i == 1){
                maiorPeso = peso;
                menorPeso = peso;
            }
            else{
                if(peso > maiorPeso){
                    maiorPeso = peso;
                }
                if(peso < menorPeso){
                    menorPeso = peso;
                }
            }
        }
        System.out.printf("O maior peso lido foi de %.1fKg%n",maiorPeso);
        System.out.printf("O menor peso lido foi de %.1fKg%n",menorPeso);

        sc.close();

    }
}
