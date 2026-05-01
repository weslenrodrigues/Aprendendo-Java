//Crie um programa que receba uma temperatura em graus Celsius (int) e exiba a
//temperatura convertida em graus Fahrenheit (double). A fórmula para conversão é:
//Fahrenheit = (Celsius * 9 / 5) + 32

import java.util.Scanner;

public class exercicio4 {
    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);

        int grausCelsius;

        System.out.printf ("Digite os graus em celsius\n");
        grausCelsius = scan.nextInt();

        double grausFahrenheit = (grausCelsius * 9 / 5) + 32;

        System.out.printf ("O resultado em Fahrenheit é: %.2f\n", grausFahrenheit);
        scan.close();
    }
}
