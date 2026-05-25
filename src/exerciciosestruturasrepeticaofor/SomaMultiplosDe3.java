package exerciciosestruturasrepeticaofor;

public class SomaMultiplosDe3 {
    public static void main(String[] args) {


        /*Faça um programa que calcule a soma entre todos os números que são ímpares e múltiplos de três e que se encontram no intervalo de 1 até 500.*/

        int contador = 0;
        int soma = 0;

        for(int i = 1; i <= 500; i++){
            if(i % 3 == 0 && i % 2 != 0){
                contador++;
                soma+=i;
            }
        }

        System.out.println("A soma dos " + contador + " valores solicitados foi " + soma);
    }
}
