//Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível para doar sangue.
//Para ser compatível, o doador deve atender aos seguintes critérios:

//Ter entre 18 e 65 anos.
//Pesar mais de 50 kg.

import java.util.Scanner;

public class exercicio9 {
    public static void main (String[] args) {

        double peso;
        int idade;
        Scanner scan = new Scanner (System.in);

        System.out.printf ("\n\nInsira a sua idade\n");
        idade = scan.nextInt();

        System.out.printf ("Insira seu peso\n");
        peso = scan.nextDouble();

        if (idade >= 18 && idade <= 65 && peso > 50) {
            System.out.printf ("O doador é compatível.\n");
        } else {
            System.out.printf ("O doador não é compatível\n");
            System.out.printf ("Motivos:\n");
            
            if (idade < 18 || idade > 65) {
                System.out.printf ("- Deve ter entre 18 e 65 anos (idade atual: %d)\n", idade);
            }
            if (peso <= 50) {
                System.out.printf ("- O peso tem que ser maior que 50kg (peso atual: %.1f kg)\n", peso);
            }
        }
        scan.close();
    }
}
