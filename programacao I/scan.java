import java.util.Scanner;

public class scan {

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        int notaEtapa1,notaEtapa2, mediaAluno;
        final int MEDIA = 6;
        String aluno;

        System.out.println("\n\n\nDigite o nome do aluno");
        aluno = scan.nextLine();

        System.out.println("Digite a nota da primeira etapa");
        notaEtapa1 = scan.nextInt();

        System.out.println("Digite a nota da segunda etapa");
        notaEtapa2 = scan.nextInt();
    
        mediaAluno = (notaEtapa1 + notaEtapa2) / 2;

        if (mediaAluno >= MEDIA) {

            System.out.printf("%s foi aprovado(a) com nota %d de media", aluno, mediaAluno);
        } else {
            System.out.printf("%s aluno foi reprovado(a) com nota %d de media", aluno, mediaAluno);
        }

        scan.close();
    }
}