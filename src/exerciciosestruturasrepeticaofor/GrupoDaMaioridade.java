package exerciciosestruturasrepeticaofor;

import java.util.Scanner;
import java.time.LocalDate;

public class GrupoDaMaioridade {
    public static void main(String[] args) {

        /*Crie um programa que leia o ano de nascimento de sete pessoas. No final, mostre quantas pessoas ainda não atingiram a maioridade e quantas já são maiores.*/

        Scanner sc = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear();

        int maiorIdade = 0;
        int menorIdade = 0;

        for(int i = 1; i <= 7; i++){
            System.out.print("Em que ano a " + i + "ª pessoa nasceu?");
            int anoNascimento = sc.nextInt();
            int idade = anoAtual - anoNascimento;
            if(idade >= 18){
                maiorIdade++;
            }
            else{
                menorIdade++;
            }
        }

        System.out.println("Ao todo tivemos " + maiorIdade + " pessoas maiores de idade");
        System.out.println("E também tivemos " + menorIdade + " pessoas menos de idade");

        sc.close();
    }
}
