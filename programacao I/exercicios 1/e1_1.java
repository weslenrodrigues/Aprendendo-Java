//Ler a resistência de 2 resistores associados em série, calcular e escrever o valor da resistência equivalente
import java.util.Scanner;

public class e1_1 {

    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);
        double resistor1, resistor2, resultado;

        System.out.println("Qual a resistência do primeiro resistor?");
        resistor1 = scan.nextDouble(); 

        System.out.println("Qual a resistência do segundo resistor?");
        resistor2 = scan.nextDouble();

        resultado = resistor1 + resistor2;

        System.out.printf("O Resultado da associação foi: %.2f", resultado);
        scan.close();
    }
}