//Saída esperada:
//Nome: Maria
//Idade: 25
//Altura: 1.68
//É estudante: true
import java.util.Scanner;

public class exercicio1 {

    public static void main (String[] args) {

    Scanner scan = new Scanner (System.in);

    String nomeString;
    int idade;
    double altura;
    boolean estudante;

    System.out.printf ("Digite seu nome\n");
    nomeString = scan.nextLine();

    System.out.printf ("Digite sua idade\n");
    idade = scan.nextInt();

    System.out.printf  ("Digite sua altura\n");
    altura = scan.nextDouble();

    System.out.printf ("Você é um estudante? (true or false)\n");
    estudante = scan.nextBoolean();

    System.out.printf ("Nome: %s\n", nomeString);
    System.out.printf ("Idade: %d\n", idade);
    System.out.printf ("Altura: %.2f\n", altura);
    System.out.printf ("É estudante: %b\n", estudante);

    scan.close();
    }
}
