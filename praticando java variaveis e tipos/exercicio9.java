//Você está desenvolvendo um programa que precisa verificar se uma pessoa é maior de idade ou não.
//O programa deve exibir uma mensagem informando se a pessoa pode ou não acessar um determinado conteúdo restrito.
//No entanto, você cometeu um erro ao implementar a lógica de verificação e precisa corrigir isso.
//Sua tarefa é:
//Identificar e corrigir o erro de escopo de variáveis no código.
//Garantir que o programa exiba a mensagem correta com base na idade da pessoa, no código abaixo a saída será Você é menor de idade.

import java.util.Scanner;

public class exercicio9 {
    public static void main (String[] args) {

        int idadePessoa;
        Scanner scan = new Scanner(System.in);

        System.out.printf ("\n\nDigite sua idade\n\n");
        idadePessoa = scan.nextInt();

        if (idadePessoa >= 18) {

            System.out.printf ("Você é maior de idade");
        } else {

            System.out.printf ("Você é menor de idade");
        }

        scan.close();
    }    
}
