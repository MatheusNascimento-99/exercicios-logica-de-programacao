package exerciciosestruturasrepeticaofor;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("DETECTOR DE PALINDROMO");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("Digite uma palavra ou frase:");
        String frase = sc.nextLine().toUpperCase();
        String fraseConvertida = frase.toUpperCase().replace(" ", "" );
        String fraseInverso = "";

        for(int i = fraseConvertida.length()-1; i >= 0; i--){
            fraseInverso += fraseConvertida.charAt(i);
        }
        System.out.println("Você digitou " + frase);
        System.out.println("Que ao contrário fica: " + fraseInverso);

        if(fraseConvertida.equals(fraseInverso)){
            System.out.println("TEMOS UM PALÍMDROMO!");
        }
        else{
            System.out.println("NÃO TEMOS UMA PALÍDROMO");
        }

        sc.close();


    }
}
