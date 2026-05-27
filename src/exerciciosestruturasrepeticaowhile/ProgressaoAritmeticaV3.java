package exerciciosestruturasrepeticaowhile;

import java.util.Scanner;

public class ProgressaoAritmeticaV3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Gerador de PA");
        System.out.println("=-=-=-=-=-=-=-=");
        System.out.print("Primeiro termo:");
        int termo = sc.nextInt();
        System.out.print("Razão da PA:");
        int razao = sc.nextInt();
        int contador = 0;
        int mais = 10;
        int total = 0;

        while(mais != 0){
            total += mais;
            while(contador < total){
                System.out.print(termo + " » ");
                termo+=razao;
                contador++;
            }
            System.out.println("PAUSA");
            System.out.print("Quantos termos você quer mostrar a mais?");
            mais = sc.nextInt();

        }

        System.out.println("PROGRSSÃO FINALIZADA COM " + total + " TERMOS MOSTRADOS");

        sc.close();



    }
}
