//Ler o raio de um círculo, calcular e escrever a sua área.

import java.util.Scanner;

public class e1_2 {
    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);

        double raioCirculo, areaCirculo, pi = 3.14;

        System.out.println("Qual o raio do circulo?");
        raioCirculo = scan.nextDouble();

        areaCirculo = pi * (raioCirculo * raioCirculo);
        System.out.printf("A área do circulo é %f", areaCirculo);
        scan.close();
    }
}
