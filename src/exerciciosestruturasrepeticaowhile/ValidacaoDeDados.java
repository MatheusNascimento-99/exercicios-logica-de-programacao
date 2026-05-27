package exerciciosestruturasrepeticaowhile;

import java.util.Scanner;

public class ValidacaoDeDados {
    public static void main(String[] args) {

        /* Faça um programa que leia o sexo de uma pessoa, mas só aceite os valores 'M' ou 'F'.
              Caso esteja errado, peça a digitação novamente até ter um valor correto.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu sexo: [M/F]:");
        char sexo = Character.toUpperCase(sc.next().charAt(0));
        while(sexo != 'M' && sexo != 'F'){
            System.out.print("Dados inválidos. Por favor, informe seu sexo [M/F]:");
            sexo = Character.toUpperCase(sc.next().charAt(0));
        }
        System.out.println("Sexo " + sexo + " registrado com sucesso!");

        sc.close();
    }
}
