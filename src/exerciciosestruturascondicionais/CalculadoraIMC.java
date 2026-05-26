package exerciciosestruturascondicionais;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        /*Desenvolva uma lógica que leia o peso e a altura de uma pessoa, calcule seu Índice de Massa Corporal (IMC) e mostre seu status, de acordo com a tabela abaixo:
            - IMC abaixo de 18,5: Abaixo do Peso
            - Entre 18,5 e 25: Peso Ideal
            - 25 até 30: Sobrepeso
            - 30 até 40: Obesidade
            - Acima de 40: Obesidade Mórbida

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o seu peso? (Kg) ");
        double peso = sc.nextDouble();
        System.out.print("Qual é a sua altura? (m) ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("O IMC dessa pessoa é de %.1f%n",imc);

        if(imc < 18.5){
            System.out.println("CUIDADO! Você está abaixo do peso");
        }
        else if(imc < 25.0){
            System.out.println("PARABÉNS! Você está na faixa de peso ideal");
        }
        else if(imc < 30){
            System.out.println("ATENÇÃO! Você está em sobrepeso");
        }
        else if(imc < 40){
            System.out.println("ALERTA! Você está em obesidade ");
        }
        else{
            System.out.println("CUIDADO! Você está em obesidade MÓRBIDA ");
        }

        sc.close();

    }
}
