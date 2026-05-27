package exerciciosestruturasrepeticaofor;


import java.util.Scanner;

public class AnalisadorCompleto {
    public static void main(String[] args) {

        /* Desenvolva um programa que leia o nome, idade e sexo de 4 pessoas. No final do programa, mostre:
           - a média de idade do grupo,
           - qual é o nome do homem mais velho
           - quantas mulheres têm menos */

        Scanner sc = new Scanner(System.in);

        double somaIdades = 0.0;
        int idadeHomemMaisVelho = 0;
        String nomeHomemMaisVelho = "";
        int mulheresMenos20 = 0;

        for(int i = 1; i <= 4; i++){
            System.out.println("----- "+i+"ª PESSOA -----");
            System.out.print("Nome:");
            String nome = sc.nextLine();
            System.out.print("Idade:");
            int idade = sc.nextInt();
            somaIdades+=idade;
            System.out.print("Sexo [M/F]:");
            char sexo = Character.toUpperCase(sc.next().charAt(0));
            sc.nextLine();
            if(i == 1 && sexo == 'M'){
                nomeHomemMaisVelho = nome;
                idadeHomemMaisVelho = idade;
            }
            else{
                if(idade > idadeHomemMaisVelho){
                    nomeHomemMaisVelho = nome;
                    idadeHomemMaisVelho = idade;
                }
            }
            if(idade < 20 && sexo == 'F'){
                mulheresMenos20++;
            }
        }

        double media = somaIdades / 4;

        System.out.printf("A média de idade do grupo é de %.1f anos %n",media);
        System.out.println("O homem mais velho tem " + idadeHomemMaisVelho + " anos e se chama " + nomeHomemMaisVelho + ".");
        System.out.println("Ao todo são " + mulheresMenos20 + " mulher(es) com menos de 20 anos");

        sc.close();

    }
}
