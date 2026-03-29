import java.util.Scanner;

public class login {
    public static void main (String [] args) {

        String usuario = "", confirmandoUsuario = "";
        String senha = "", confirmandoSenha = "";
        Scanner scan = new Scanner (System.in);

        System.out.println("Insira seu usuário");
        usuario = scan.nextLine();

        System.out.println("Insira sua senha");
        senha = scan.nextLine();

        do {
        System.out.println("Confirme seu usuário");
        confirmandoUsuario = scan.nextLine();

        System.out.println("Confirme sua senha");
        confirmandoSenha = scan.nextLine();

        if (!confirmandoUsuario.equals(usuario)) {
            System.out.println("Usuário incorreto");
        }

        if (!confirmandoSenha.equals(senha)) {
            System.out.println("Senha incorreta");
        }

        } while (!confirmandoUsuario.equals(usuario) || !confirmandoSenha.equals(senha));

        System.out.println("Logado com sucesso");

        scan.close();
    }
}
