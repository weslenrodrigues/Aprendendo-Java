import java.util.Scanner;
//Ler um valor de corrente em A e um valor de resistência em KOhms. Calcular e escrever a tensão em Volts.


public class e1_3 {
    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);

        double corrente, resistencia;
        int tensao;

        System.out.println("Qual a corrente do circuito?");
        corrente = scan.nextDouble();

        System.out.println("Qual a resistência do circuito?");
        resistencia = scan.nextDouble();

        tensao = (int) (corrente * resistencia); //transformando double em int (casting acho)

        System.out.printf("A tensão é %d", tensao);
        scan.close();
    }
}
