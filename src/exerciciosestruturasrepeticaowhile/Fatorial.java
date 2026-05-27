package exerciciosestruturasrepeticaowhile;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular seu fatorial:");
        int numero = sc.nextInt();
        int fatorial = 1;
        int contador = numero;
        while(contador > 0){
            fatorial *= contador;
            contador--;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);

    }
}
