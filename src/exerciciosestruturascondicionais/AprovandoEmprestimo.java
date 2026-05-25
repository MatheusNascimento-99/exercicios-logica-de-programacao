package exerciciosestruturascondicionais;

import java.util.Scanner;

public class AprovandoEmprestimo {

    public static void main(String[] args) {

        /* Escreva um programa para aprovar o empréstimo bancário para a compra de uma casa. Pergunte o valor da casa,
            o salário do comprador e em quantos anos ele vai pagar.
            A prestação mensal não pode exceder 30% do salário ou então o empréstimo será negado.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor da casa?");
        double valorCasa = sc.nextDouble();
        System.out.print("Salário do comprador: R$");
        double salario = sc.nextDouble();
        System.out.print("Quantos anos de financiamento:");
        int anosFinanciamento = sc.nextInt();
        double prestacao = valorCasa / (anosFinanciamento * 12);
        double porcentagem =  (prestacao / salario) * 100;
        System.out.printf("Para pagar uma casa de R$%.2f em %d anos a prestação será de R$%.2f%n",valorCasa,anosFinanciamento,prestacao);
        if(porcentagem > 30){
            System.out.println("Empréstimo NEGADO!");
        }
        else{
            System.out.println("Empréstimo CONCEDIDO!");
        }

        sc.close();

    }
}
