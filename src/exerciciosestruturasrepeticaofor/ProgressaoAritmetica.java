package exerciciosestruturasrepeticaofor;

import java.util.Scanner;

public class ProgressaoAritmetica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("GERADOR DE PA");
        System.out.println("=-=-=-=-=-=-=-=");

        System.out.print("Primeiro termo:");
        int termo = sc.nextInt();
        System.out.print("Razão:");
        int razao = sc.nextInt();
        System.out.print(termo + " » ");
        for(int i = termo; i<=10; i++){
            termo+=razao;
            System.out.print(termo + " » ");
        }
        System.out.print("FIM");

        sc.close();
    }
}
