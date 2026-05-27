package exerciciosestruturasrepeticaowhile;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("Sequência de Fibonacci");
        System.out.println("-----------------------");

        System.out.print("Quantos termos você quer mostrar?");
        int termos = sc.nextInt();
        int termo1 = 0;
        int termo2 = 1;
        int contador = 3;
        System.out.println("===================================");
        System.out.print(termo1 + " » " + termo2 + " » ");
        while(contador <= termos){
            int termoSeguinte = termo1 + termo2;
            System.out.print(termoSeguinte + " » ");
            termo1 = termo2;
            termo2 = termoSeguinte;
            contador++;
        }
        System.out.println("FIM");
        System.out.println("====================================");

        sc.close();


    }
}
