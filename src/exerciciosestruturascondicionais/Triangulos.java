package exerciciosestruturascondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {


        /* Desenvolva um programa que leia o comprimento de três retas e diga ao usuário se elas podem ou não formar um triângulo.

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=-=-=-=-=-=-=-==--=-=-=-=");
        System.out.println("ANALISADOR DE TRIÂNGULOS");
        System.out.println("=-=-=-=-=-=-=-==--=-=-=-=");

        System.out.print("Primeiro segmento:");
        double a = sc.nextDouble();
        System.out.print("Segundo segmento:");
        double b = sc.nextDouble();
        System.out.print("Terceiro segmento:");
        double c = sc.nextDouble();

        if(a + b > c && a + c > b && c + b > a){
            System.out.println("Os segmentos acima PODEM FORMAR UM TRIÂNGULO");
        }
        else{
            System.out.println("Os segmentos acima NÃO PODEM FORMAR UM TRIÂNGULO");
        }

        sc.close();

    }
}
