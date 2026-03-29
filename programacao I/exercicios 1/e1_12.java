//Escreva um programa para ler um inteiro representando um valor em reais. Calcular e imprimir a quantidade
//mínima de notas de 20,10,5,2 e 1 necessária para obter o valor lido.

import java.util.Scanner;

public class e1_12 {

    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);

        int dinheiroTotal, nota20, nota10, nota5, nota2, nota1;

        System.out.println("\n\n\nInsira a quantidade total de dinheiro");
        dinheiroTotal = scan.nextInt();

        nota20 = dinheiroTotal/20;
        dinheiroTotal = dinheiroTotal % 20;

        nota10 = dinheiroTotal/10;
        dinheiroTotal = dinheiroTotal % 10;

        nota5 = dinheiroTotal/5;
        dinheiroTotal = dinheiroTotal % 5;

        nota2 = dinheiroTotal/2;
        dinheiroTotal = dinheiroTotal % 2;

        nota1 = dinheiroTotal/1;
        dinheiroTotal = dinheiroTotal % 1;

        System.out.printf ("Nota 20: %d\n", nota20);
        System.out.printf ("Nota 10: %d\n", nota10);
        System.out.printf ("Nota 5: %d\n", nota5);
        System.out.printf ("Nota 2: %d\n", nota2);
        System.out.printf ("Nota 1: %d\n", nota1);

        scan.close();
    }
}