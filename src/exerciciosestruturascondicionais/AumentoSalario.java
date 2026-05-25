package exerciciosestruturascondicionais;

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {

        /* Escreva um programa que pergunte o salário de um funcionário e calcule o valor do seu aumento.
           Para salários superiores a R$1250,00, calcule um aumento de 10%.
           Para os inferiores ou iguais, o aumento é de 15%.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o salário do funcionário?R$");
        double salario = sc.nextDouble();
        double aumento = 0;
        double novoSalario = 0;
        if(salario > 1250){
             aumento = salario * 0.10;
             novoSalario = aumento + salario;
        }
        else{
            aumento = salario * 0.15;
            novoSalario = aumento + salario;
        }

        System.out.printf("Quem ganhava R$%.2f agora passa a ganhar R$%.2f%n",salario,novoSalario);

        sc.close();



    }
}
