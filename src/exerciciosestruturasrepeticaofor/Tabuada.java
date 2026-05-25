package exerciciosestruturasrepeticaofor;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        /* Faça um programa que leia um número e moestre sua tabuada até 10 */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver a sua tabuada:");
        int numero = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
   }
}
