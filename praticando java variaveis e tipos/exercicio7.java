//Você está desenvolvendo um jogo e quer um programa que determine se um número é par ou ímpar.
//Escreva um programa que classifique um número e exiba uma mensagem informando se o número é par ou ímpar.

import java.util.Scanner;

public class exercicio7 {
    public static void main (String[] args) {

        int numero, resto;
        Scanner scan = new Scanner(System.in);

        System.out.printf ("Digite um numero\n");
        numero = scan.nextInt();

        resto = numero % 2;
        if (resto == 1) {

            System.out.printf ("\n\nO número é ímpar\n\n");
        } else {

            System.out.printf ("\n\nO número é par\n\n");
        }
        scan.close();
    }  
}
