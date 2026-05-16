//Você está organizando uma viagem internacional e precisa converter uma quantia em reais (R$) 
//para dólares americanos (US$) com base na taxa de câmbio atual. A taxa utilizada no momento é de R$ 5,25 para cada US$ 1.
//Crie um programa que realize a conversão para dólares usando a taxa de câmbio e exiba o valor convertido.

import java.util.Scanner;

public class exercicio8 {
    public static void main (String[] args) {

        double valorDolar = 5.25, valorReal;
        Scanner scan = new Scanner(System.in);

        System.out.printf ("\n\nDigite o valor em reais\n\n");
        valorReal = scan.nextDouble();

        double conversaoDinheiro = valorReal / valorDolar;

        System.out.printf ("O valor em dólares é US$%.2f", conversaoDinheiro);
        scan.close();
    }
}
