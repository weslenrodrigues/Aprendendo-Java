//Ajude Pedro a resolver esse problema! Crie um programa que solicite 
//ao usuário dois números inteiros, compare-os e exiba uma mensagem 
//indicando qual é o maior ou se ambos são iguais.

import java.util.Scanner;

public class exercicio4 {
    public static void main (String[] args) {

        int numero1, numero2, maiorNumero;
        Scanner scan = new Scanner(System.in);

        System.out.printf ("Digite o primeiro número\n");
        numero1 = scan.nextInt();

        System.out.printf ("Digite o segundo número\n");
        numero2 = scan.nextInt();

        if (numero1 > numero2 ) {

            maiorNumero = numero1;
            System.out.printf ("O maior numero é %d", maiorNumero);
        }

        if (numero1 == numero2) {

            System.out.printf ("%d e %d são iguais", numero1, numero2);
        }

        if (numero1 < numero2) {

            maiorNumero = numero2;
            System.out.printf ("O maior numero é %d", maiorNumero);
        }

        scan.close();
    }
}
