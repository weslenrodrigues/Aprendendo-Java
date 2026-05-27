//Crie um programa que receba o código de acesso e o nível de permissão e exiba uma mensagem indicando
//se o acesso foi permitido ou negado, além do motivo, se for o caso.

import java.util.Scanner;

public class exercicio10 {
    public static void main (String[] args) {

        int codigoAcesso = 1234, tentativaAcesso;
        Scanner scan = new Scanner(System.in);
        int nivelPermissao;

        System.out.printf ("Digite o codigo de acesso: ");
        tentativaAcesso = scan.nextInt();
        
        System.out.printf ("Digite o nivel de permissão: ");
        nivelPermissao = scan.nextInt();

        if (tentativaAcesso == codigoAcesso && nivelPermissao > 0 || nivelPermissao <= 3) {

            System.out.printf ("\n\nAcesso permitido. Bem vindo ao sistema!");
        } else {
        
            System.out.printf ("\n\nAcesso Negado. Motivo(s):\n");
            if (tentativaAcesso != codigoAcesso) {

              System.out.printf ("- Código de acesso incorreto.\n");  
            }

            if (nivelPermissao < 0 || nivelPermissao > 3)
            System.out.printf ("- Nível de permissão inválido.\n");
        }
        scan.close();
    }
}
