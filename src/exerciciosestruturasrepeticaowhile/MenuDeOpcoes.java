package exerciciosestruturasrepeticaowhile;

import java.util.Scanner;

public class MenuDeOpcoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor:");
        int valor1 = sc.nextInt();
        System.out.print("Segundo valor:");
        int valor2 = sc.nextInt();
        int opcoes = 0;
        while(opcoes != 5){
            System.out.print("""
                    [ 1 ] somar
                    [ 2 ] multiplicar
                    [ 3 ] maior
                    [ 4 ] novos números
                    [ 5 ] sair do programa
                    Qual é a sua opção?""");
            opcoes = sc.nextInt();
            if(opcoes == 1){
                int soma = valor1 + valor2;
                System.out.println("A soma entre " + valor1 + " + " + valor2 + " é " + soma);
                System.out.println("=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
            else if(opcoes == 2){
                int multiplicar = valor1 * valor2;
                System.out.println("A multiplicação entre " + valor1 + " x " + valor2 + " é " + multiplicar);
                System.out.println("=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
            else if(opcoes == 3){
                int maiorValor = 0;
                if(valor1 > valor2){
                    maiorValor = valor1;
                    System.out.println("Entre " + valor1 + " e " + valor2 + " o maior valor é " + maiorValor);
                    System.out.println("=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                }
                else{
                    maiorValor = valor2;
                    System.out.println("Entre " + valor1 + " e " + valor2 + " o maior valor é " + maiorValor);
                    System.out.println("=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                }
            }
            else if(opcoes == 4){
                System.out.println("Informe os números novamente");
                System.out.print("Primeiro valor:");
                valor1 = sc.nextInt();
                System.out.print("Segundo valor:");
                valor2 = sc.nextInt();
                System.out.println("=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            }
            else if(opcoes == 5){
                System.out.println("Encerrando programa...");
            }
            else{
                System.out.println("Opção inválida tente novamente!");
                System.out.println("=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            }
        }

        sc.close();

    }
}
