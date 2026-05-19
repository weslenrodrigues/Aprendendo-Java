//Marcos trabalha em uma loja e precisa verificar se um cliente tem direito a um desconto de 10%
//em sua compra. O desconto é aplicado apenas se o valor da compra for maior ou igual a R$ 100,00.
//Para isso, ele quer um programa que permita inserir o valor da compra e exiba se o desconto foi aplicado
//ou não, juntamente com o novo valor após o desconto, caso aplicável.

import java.util.Scanner;

public class exercicio5 {
    public static void main (String[] args) {

        double valorCompra;
        Scanner scan = new Scanner (System.in);

        System.out.printf ("\n\nInsira o valor da compra\n");
        valorCompra = scan.nextDouble();
        
        double descontoCompra = (10*valorCompra) / 100;

        if (valorCompra >= 100) {
         
            System.out.printf ("\nDesconto de 10 porcento aplicado.\n");
            System.out.printf ("O valor da compra ficou: R$%.2f", valorCompra - descontoCompra);
        }

        if (valorCompra < 100) {

            System.out.printf ("\nNenhum desconto aplicado.\n");
            System.out.printf ("O valor da compra ficou: R$%.2f", valorCompra);
        }

        scan.close();
    }
}
