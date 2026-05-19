//Crie um programa que receba um dia da semana (em letras minúsculas)
//e exiba uma mensagem indicando se é um dia útil ou não.

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String dia;
        
        System.out.printf ("\n\nDigite o dia da semana\n");
        dia = scan.nextLine();

        if (dia.equals("segunda") || dia.equals("terça")||
            dia.equals("quarta") || dia.equals("quinta")||
            dia.equals("sexta")) {

            System.out.printf ("%s é um dia útil", dia);
        } else {
            System.out.printf ("%s não é um dia útil", dia);
        }
        scan.close();
    }
}
