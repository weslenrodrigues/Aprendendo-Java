//Ana precisa identificar se um número é par ou ímpar para um jogo que está desenvolvendo. Para isso,
//deseja criar um programa que analisa se o número que ela definiu previamente é par ou ímpar.

import java.util.Scanner;

public class exercicio1{

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero, resto;

        System.out.printf ("Digite um número\n");
        numero = scan.nextInt();

        resto = numero % 2;

        if (resto == 1) {

            System.out.printf ("%d é ímpar", numero);
        } else {

            System.out.printf ("%d é par", numero);
        }
        scan.close();
    }
}