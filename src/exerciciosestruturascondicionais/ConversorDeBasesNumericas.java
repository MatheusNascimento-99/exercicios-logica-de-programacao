package exerciciosestruturascondicionais;

import java.util.Scanner;

public class ConversorDeBasesNumericas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro:");
        int numero = sc.nextInt();
        System.out.print("""
                Escolha uma das bases para conersão
                [ 1 ] converter para BINÁRIO
                [ 2 ] converter para OCTAL
                [ 3 ] converter para HEXADECIMAL
                Sua opção:""");
        int opcao = sc.nextInt();
        if(opcao == 1){
            System.out.println(numero + " convertido para BINÁRIO é igual " + Integer.toBinaryString(numero));
        }
        else if(opcao == 2){
            System.out.println(numero + " convertido para OCTAL é igual " + Integer.toOctalString(numero));
        }
        else if(opcao == 3){
            System.out.println(numero + " convertido para HEXADECIMAL é igual " + Integer.toHexString(numero));
        }
        else{
            System.out.println("OPCÃO INVÁLIDA, POR FAVOR TENTE NOVAMENTE!");
        }

        sc.close();
    }
}
