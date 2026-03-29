import java.util.Scanner;

public class contabancaria {
    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);

        double saldoInicial, saldoReceber;
        String nomeUsuarioString, senhaUsuarioString, tipoContaString, confirmandoSenhaString, confirmandoNomeUsuarioString;

        System.out.print("\n\n***************INSIRA OS SEUS DADOS***************\n\n");

        System.out.print("Nome: ");
        nomeUsuarioString = scan.nextLine();

        System.out.print("Senha: ");
        senhaUsuarioString = scan.nextLine();

        System.out.print("Tipo de Conta (Corrente, Poupança e etc...): ");
        tipoContaString = scan.nextLine();

        System.out.print("Saldo Inicial: R$");
        saldoInicial = scan.nextDouble();
        scan.nextLine();

        System.out.println ("\n\nCadastro feito com sucesso!\n\n");       
        System.out.println("*********************************************\n");

        do {
            System.out.println("Confirme seu nome:");
            confirmandoNomeUsuarioString = scan.nextLine();

            if (!confirmandoNomeUsuarioString.equals(nomeUsuarioString)) {
                System.out.println("\nNome incorreto\n");
            }
        } while (!confirmandoNomeUsuarioString.equals(nomeUsuarioString));

        do {
            System.out.println("Confirme sua senha:");
            confirmandoSenhaString = scan.nextLine();

            if (!confirmandoSenhaString.equals(senhaUsuarioString)) {
                System.out.println("\nSenha incorreta\n");
            }
        } while (!confirmandoSenhaString.equals(senhaUsuarioString));

        System.out.println("\n*********************************************\n");

        System.out.print("\n\n\n\n\nLogado com sucesso\n");

        int menuOpcao;
        boolean rodando = true;

        while (rodando) {
            System.out.print ("\n\n********** OPERAÇÕES **********\n\n");
            System.out.println("1 - Consultar saldos"); 
            System.out.println("2 - Receber valor"); 
            System.out.println("3 - Transferir Valor"); 
            System.out.println("4 - Sair"); 
            System.out.print ("\n*******************************\n\n");
            System.out.print("Digite a opção desejada: ");
            menuOpcao = scan.nextInt();
            scan.nextLine();

            switch (menuOpcao) {
                case 1:
                    System.out.print ("\n\n****************************************\n");
                    System.out.println ("Dados iniciais do cliente:\n");
                    System.out.printf ("Nome:                   %s\n", nomeUsuarioString);
                    System.out.printf ("Tipo Conta:             %s\n", tipoContaString);
                    System.out.printf ("Saldo:                  R$ %.2f\n", saldoInicial);
                    System.out.println("****************************************");
                    break;

                case 2:
                    System.out.print("\nInforme o valor a receber: R$ ");
                    saldoReceber = scan.nextDouble();
                    saldoInicial = saldoInicial + saldoReceber;
                    System.out.printf("\nSaldo atualizado: R$ %.2f\n", saldoInicial);
                    break;

                case 3:
                    System.out.print("\nInforme o valor a transferir: R$ ");
                    saldoReceber = scan.nextDouble();
                    if (saldoReceber <= saldoInicial) {
                        saldoInicial = saldoInicial - saldoReceber;
                        System.out.printf("\nSaldo atualizado: R$ %.2f\n", saldoInicial);
                    } else {
                        System.out.println("\nSaldo insuficiente!\n");
                    }
                    break;

                case 4:
                    System.out.println("\nSaindo da conta!");
                    rodando = false;
                    break;
                
                default:
                    System.out.println("\nOpção inválida!\n");
            }
        }
        scan.close();
    }
}