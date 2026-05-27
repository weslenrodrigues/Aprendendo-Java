//Ajude Jéssica a criar um programa que, com base em uma senha pré-definida, por exemplo: 123456
// verifique se o que o usuário digitou está correto ou não.
//O programa deve comparar a tentativa com a senha correta e exibir se o acesso foi permitido ou negado.

import java.util.Scanner;

public class exercicio3 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        String senhaFixa = "123456";
        String senhaTentativa;

        do {
            System.out.printf ("Digite a sua senha: ");
            senhaTentativa = scan.nextLine();
            
            if (!senhaTentativa.equals(senhaFixa)) {
                System.out.printf ("Senha incorreta. Tente novamente.\n");
            }
        } while (!senhaTentativa.equals(senhaFixa));
        
        System.out.printf ("Acesso permitido\n");
        
        scan.close();
    }
}
