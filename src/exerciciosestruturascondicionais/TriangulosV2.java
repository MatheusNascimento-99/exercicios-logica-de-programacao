package exerciciosestruturascondicionais;

import java.util.Scanner;

public class TriangulosV2 {
    public static void main(String[] args) {

        /* Refaça o DESAFIO  dos triângulos, acrescentando o recurso de mostrar que tipo de triângulo será formado:
            EQUILÁTERO: todos os lados iguais
            ISÓSCELES: dois lados iguais, um diferente
            ESCALENO: todos os lados diferentes

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro segmento:");
        double a = sc.nextDouble();
        System.out.print("Segundo segmento:");
        double b = sc.nextDouble();
        System.out.print("Terceiro segmento:");
        double c = sc.nextDouble();

        if(a + b > c && a + c > b && b + c > a){
            System.out.print("Os lados PODEM FORMAR um triângulo ");
            if(a == b && a == c){
                System.out.println("Do tipo EQUILÁTERO");
            }

            else if(a != b && a != c && b != c){
                System.out.println("Do tipo ESCALENO");
            }
            else{
                System.out.println("Do tipo ISÓSCELES");
            }
        }
        else{
            System.out.println("Os lados NÃO PODEM FORMAR um triàngulo");
        }
    }
}
