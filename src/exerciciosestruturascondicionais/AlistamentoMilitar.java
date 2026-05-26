package exerciciosestruturascondicionais;

import java.time.LocalDate;
import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[]args){

        /* Faça um programa que leia o ano de nascimento de um jovem e informe, de acordo com a sua idade, se ele ainda vai se alistar ao serviço militar,
           se é a hora exata de se alistar ou se já passou do tempo do alistamento.
            Seu programa também deverá mostrar o tempo que falta ou que passou do prazo.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Ano de nascimento:");
        int ano = sc.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - ano;
        System.out.println("Quem nasceu em " + ano + " tem " + idade + " anos em 2026.");
        int anoParaAlistar = idade - 18;
        int anoAlistamento = anoAtual - idade + 18;
        if(idade < 18){
            anoParaAlistar = 18 - idade;
            System.out.println("Ainda faltam " + anoParaAlistar + " ano(s) para o alistamento");
            System.out.println("Seu alistamento será em " + anoAlistamento);
        }
        else if(idade > 18){
            System.out.println("Você já deveria ter se alistado há " + anoParaAlistar + " anos");
            System.out.println("Seu alistamento foi em " + anoAlistamento);
        }
        else{
            System.out.println("Você deve se alistar IMEDIATAMENTE!");
        }

        sc.close();
    }
}
