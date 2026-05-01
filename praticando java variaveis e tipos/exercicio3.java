//Você está desenvolvendo um aplicativo que calcula a média de notas dos alunos.
//Para isso, você precisa armazenar as notas em variáveis do tipo double.
//Você decide criar três variáveis chamadas nota1, nota2 e nota3, 
//e atribuir a elas os valores 7.5, 8.0 e 9.0, respectivamente e em seguida,
//calcular a média e exibi-la na tela.
import java.util.Scanner;

public class exercicio3 {
    public static void main (String[] args) {

        double nota1, nota2, nota3, medianotas;
        Scanner scan = new Scanner (System.in);

        System.out.printf ("Digite a primeira nota\n");
        nota1 = scan.nextDouble();

        System.out.printf ("Digite a segunda nota\n");
        nota2 = scan.nextDouble();

        System.out.printf ("Digite a terceira nota\n");
        nota3 = scan.nextDouble();

        medianotas = (nota1 + nota2 + nota3) / 3;

        System.out.printf ("A média das notas foi: %.2f", medianotas);
        scan.close();
    }
}
