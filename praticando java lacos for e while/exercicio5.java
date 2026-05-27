//Carlos tem uma lista de números e quer descobrir qual é o maior valor.
//Para isso, ele decidiu percorrer a lista comparando cada número com o maior encontrado
//até o momento. Crie um programa que receba uma lista de números e encontre o maior número.
import java.util.Scanner;


public class exercicio5 {
    
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int quantidadeNumeros, maiorNumero = 0;
        
        System.out.printf ("Quantos numeros você quer comparar? ");
        quantidadeNumeros = scan.nextInt();

        int[] numeros = new int[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {

            System.out.printf ("Digite o número: ");
            numeros[i] = scan.nextInt();
        }

        for (int i = 0; i < quantidadeNumeros; i++) {

            if (numeros [i] > maiorNumero) {

                maiorNumero = numeros [i];
            }
        }

        System.out.printf ("O maior número é: %d", maiorNumero);

        scan.close();
    }
}