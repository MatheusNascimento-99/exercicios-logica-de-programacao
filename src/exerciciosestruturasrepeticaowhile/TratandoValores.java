package exerciciosestruturasrepeticaowhile;

import java.util.Scanner;

public class TratandoValores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número [999 para parar]:");
        int valor = sc.nextInt();
        int contador = 0;
        int soma = 0;
        while(valor != 999){
            contador++;
            soma+=valor;
            System.out.print("Digite um número [999 para parar]:");
            valor = sc.nextInt();
        }
        System.out.println("Você digitou " + contador + " números e a soma entre eles foi " + soma);

        sc.close();
    }
}
