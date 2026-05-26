package exerciciosestruturascondicionais;


import java.util.Scanner;

public class GerenciadorDePagamentos {
    public static void main(String[] args) {

        /* Elabore um programa que calcule o valor a ser pago por um produto, considerando o seu preço normal e condição de pagamento:
            - à vista dinheiro/cheque: 10% de desconto
            - à vista no cartão: 5% de desconto
            - em até 2x no cartão: preço formal
            - 3x ou mais no cartão: 20% de juros
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("=========== LOJAS GUANABARA ==========");
        System.out.print("Preço das compras: R$");
        double preco = sc.nextDouble();
        System.out.println("FORMAS DE PAGAMENTO");
        System.out.println("""
                [ 1 ] a vista dinheiro/cheque: 10% de desconto
                [ 2 ] a vista cartão: 5% de desconto
                [ 3 ] 2x no cartão: preço normal
                [ 4 ] 3x ou mais no cartão: 20% de juros
                Qual é a opção?""");
        int opcao = sc.nextInt();

        double desconto = 0;
        double precoFinal = 0;

        if(opcao == 1){
            desconto = preco * 10 / 100;
            precoFinal = preco - desconto;
            System.out.println("Desconto de 10% aplicado.");
            System.out.printf("Sua compra de R$%.2f vai custar R$%.2f, no final%n",preco,precoFinal);
        }
        else if(opcao == 2){
            desconto = preco * 5 / 100;
            precoFinal = preco - desconto;
            System.out.println("Desconto de 5% aplicado");
            System.out.printf("Sua compra de R$%.2f vai custar R$%.2f, no final%n",preco,precoFinal);
        }
        else if(opcao == 3){
            System.out.println("Em 2x no cartão nao temos desconto nem juros o preço se mantém o mesmo.");
            System.out.printf("Sua compra ficou em R$%.2f.%n",preco);
        }
        else if(opcao == 4){
            System.out.print("Quantas parcelas?");
            int totalParcelas = sc.nextInt();
            double juros = preco * 20 / 100;
            precoFinal = preco + juros;
            double valorParcelas = precoFinal / totalParcelas;
            System.out.printf("Sua compra será parcelada em %dx de R$%.2f COM JUROS%n",totalParcelas,valorParcelas);
            System.out.printf("Sua compra de R$ %.2f vai custar R$%.2f no final%n",preco,precoFinal);
        }
        else{
            System.out.println("ERRO! OPÇÃO INVÁLIDA");
        }

        sc.close();
    }
}
