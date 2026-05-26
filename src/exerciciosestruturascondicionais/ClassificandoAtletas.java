package exerciciosestruturascondicionais;

import java.time.LocalDate;
import java.util.Scanner;

public class ClassificandoAtletas {
    public static void main(String[] args) {

        /*  Confederação Nacional de Natação precisa de um programa que leia o ano de nascimento de um atleta e mostre sua categoria, de acordo com a idade:
                - Até 9 anos: MIRIM
                - Até 14 anos: INFANTIL
                - Até 19 anos: JÚNIOR
                - Até 25 anos: SÊNIOR
                - Acima de 25 anos: MASTER

         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Ano de nascimento:");
        int ano = sc.nextInt();
        int idade = LocalDate.now().getYear() - ano;
        System.out.println("O atleta tem " + idade + " anos.");

        if(idade <= 9){
            System.out.println("Classificação: MIRIM");
        }
        else if(idade <= 14){
            System.out.println("Classificação: INFANTIL");
        }
        else if(idade <= 19){
            System.out.println("Classificação: JUNIOR");
        }
        else if(idade <= 25){
            System.out.println("Classificação: SENIOR");
        }
        else{
            System.out.println("Classificação: MASTER");
        }

        sc.close();
    }
}
