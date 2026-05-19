//Julia é professora e precisa de um programa que ajude a determinar se um aluno foi aprovado na disciplina.
//A regra da escola é:

//O estudante é aprovado se média final é maior ou igual a 7.0.
//Se a média for entre 5.0 e 6.9, está de recuperação.
//Se for abaixo de 5.0, está reprovado.

//Crie um programa que, a partir de uma variável media
//exiba a situação do estudante conforme as regras da escola.

import java.util.Scanner;

public class exercicio2_ {
    public static void main (String[] args) {

        double mediaAluno;
        Scanner scan = new Scanner(System.in);

        System.out.printf ("Digite a média do aluno\n");
        mediaAluno = scan.nextDouble();

        if (mediaAluno >= 7) {
            
            System.out.printf ("O Aluno está aprovado");
        }

        if (mediaAluno >= 5 && mediaAluno < 7) {

            System.out.printf ("O Aluno está de recuperação");
        }

        if (mediaAluno < 5) {

            System.out.printf ("O Aluno está reprovado");
        }

        scan.close();
    }
}
