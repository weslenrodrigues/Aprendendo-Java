//Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo.
//Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o terceiro lado. 
//Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem
//formar um triângulo ou não.
//Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem informando
//se os lados podem formar um triângulo ou não.

import java.util.Scanner;

public class exercicio8 {
    public static void main (String[] args) {

        double catetoX, catetoY, hipotenusa;
        Scanner scan = new Scanner(System.in);

        System.out.printf ("Qual o tamando do cateto X?\n");
        catetoX = scan.nextDouble();

        System.out.printf ("Qual o tamanho do cateto Y?\n");
        catetoY = scan.nextDouble();

        System.out.printf ("Qual o tamanho da hipotenusa?\n");
        hipotenusa = scan.nextDouble();

        if (catetoX > hipotenusa && catetoY > hipotenusa) {

            System.out.printf ("Os lados podem formar um triângulo");
        } else {

            System.out.printf ("Não é possível criar um triângulo");
        }
        scan.close();
    }
}
