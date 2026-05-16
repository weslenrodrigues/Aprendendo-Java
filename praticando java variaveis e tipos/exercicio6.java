//Você trabalha em um e-commerce e precisa classificar os produtos em diferentes categorias com base no preço.
//Escreva um programa que classifique um produto em uma categoria com base em um preço e exiba a categoria correspondente, conforme as seguintes regras:
//Econômico: preço até R$ 50,00.
//Intermediário: preço entre R$ 50,01 e R$ 200,00.
//Premium: preço acima de R$ 200,00. Exemplo de entrada:

import java.util.Scanner;

public class exercicio6 {
    public static void main (String[] args) {

        double precoItem;
        Scanner scan = new Scanner(System.in);

        System.out.printf ("Digite o preço do item\n");
        precoItem = scan.nextDouble();

        if (precoItem < 50) {

            System.out.printf("Categoria do produto: Econômico");
        }

        if (precoItem > 50 && precoItem <= 200) {

            System.out.printf ("Categoria do produto: Intermediário");
        }

        if (precoItem > 200) {

            System.out.printf ("Categoria do produto: Premium");
        }
        scan.close();
    }
}
