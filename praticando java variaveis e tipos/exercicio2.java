//Exemplo de entrada:
//double valorDouble = 19.5;
//Saída esperada:
//O valor inteiro do produto é: 19
import java.util.Scanner;

public class exercicio2 {
    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);

        double valorDouble;

        System.out.printf ("Digite o valor com virgula\n");
        valorDouble = scan.nextDouble();

        int valorEmInt = (int) Math.round(valorDouble);

        System.out.printf ("O valor inteiro do produto é: %d\n", valorEmInt);
        scan.close();
    }
}
