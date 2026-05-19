//Emerson trabalha em um banco e precisa verificar se um número digitado pelo cliente está dentro
//da faixa permitida de valores para um empréstimo, que vai de 1000 a 5000 reais.
//Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.

import java.util.Scanner;

public class exercicio7 {
    public static void main (String[] args) {

        double emprestimoValor;
        Scanner scan = new Scanner(System.in);

        System.out.printf ("\n\nDigite o valor do empréstimo: R$");
        emprestimoValor = scan.nextDouble();

        if (emprestimoValor >= 1000 && emprestimoValor <= 5000) {

            System.out.printf ("O valor de R$%.2f está dentro do intervalo permitido para empréstimo.", emprestimoValor);
        } else {

            System.out.printf ("O valor de R$%.2f não está dentro do intervalo permitido para empréstimo.", emprestimoValor);
        }
        scan.close();
    }
}
