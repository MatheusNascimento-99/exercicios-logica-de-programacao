package exerciciosestruturasrepeticaowhile;

import java.util.Scanner;

public class MaiorMenorValor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número:");
        int numero = sc.nextInt();
        System.out.print("Quer continuar? [S/N]:");
        char continuar = Character.toUpperCase(sc.next().charAt(0));
        int contador = 1;
        int soma = numero;
        int maior = numero;
        int menor = numero;

        while(continuar != 'N'){
            contador++;
            System.out.print("Digite um número:");
            numero = sc.nextInt();
            System.out.print("Quer continuar? [S/N]:");
            continuar = Character.toUpperCase(sc.next().charAt(0));
            soma+=numero;
            if(numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
        }
        double media = (double) soma / contador;
        System.out.printf("Você digitou %d números e a média foi %.2f%n",contador,media);
        System.out.println("O maior valor foi "+ maior + " e o menor foi " + menor);

        sc.close();

    }
}
