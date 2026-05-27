//Pedro quer calcular o fatorial de um número.
//O fatorial de um número é o produto de todos os números inteiros positivos
//de 1 até o próprio número. Por exemplo, o fatorial de 5 é 5 × 4 × 3 × 2 × 1 = 120.
//Crie um programa que receba um número e calcule seu fatorial.
import java.util.Scanner;

public class exercicio4 {
    
    public static void main (String[] args) {

        int soma = 1;
        int numeroFatorial;
        Scanner scan = new Scanner(System.in);
        
        System.out.printf ("\n\n\nDigite um numero para ser o fatorial: ");
        numeroFatorial = scan.nextInt();

        for (int i = 1; numeroFatorial > i; numeroFatorial--) {

            soma *= numeroFatorial;
        }
        
        System.out.printf ("Soma total: %d", soma);
        scan.close();
    }
}