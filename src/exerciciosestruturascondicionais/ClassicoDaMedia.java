package exerciciosestruturascondicionais;

import java.util.Scanner;

public class ClassicoDaMedia {
    public static void main(String[] args) {
        /* : Crie um programa que leia duas notas de um aluno e calcule sua média, mostrando uma mensagem no final, de acordo com a média atingida:
                - Média abaixo de 5.0: REPROVADO
                - Média entre 5.0 e 6.9: RECUPERAÇÃO
                - Média 7.0 ou superior: APROVADO
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.print("Segunda nota:");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2)/2;

        System.out.printf("Tirando %.1f e %.1f, a média do aluno é %.1f%n",nota1,nota2,media);

        if(media < 5.0){
            System.out.println("O aluno foi:  REPROVADO!");
        }
        else if(media < 6.9){
            System.out.println("O aluno está de RECUPERAÇÃO!");
        }
        else{
            System.out.println("O aluno está APROVADO!");
        }

        sc.close();
    }
}
