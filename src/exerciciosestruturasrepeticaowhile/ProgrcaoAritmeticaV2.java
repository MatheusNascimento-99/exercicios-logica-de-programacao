package exerciciosestruturasrepeticaowhile;

import java.util.Scanner;

public class ProgrcaoAritmeticaV2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Gerador de PA");
        System.out.println("=-=-=-=-=-=-=-=-=");
        System.out.print("Primeiro termo:");
        int termo = sc.nextInt();
        System.out.print("Razão da PA:");
        int razao = sc.nextInt();
        int contador = 0;
        while(contador < 10){
            System.out.print(termo + " » ");
            termo+=razao;
            contador++;
        }
        System.out.print("FIM");

        sc.close();
    }
}
