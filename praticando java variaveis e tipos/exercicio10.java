//Você está planejando uma viagem de carro e deseja calcular quantos quilômetros poderá percorrer com o combustível disponível no tanque.
//Para isso, você precisa considerar:

//O consumo médio do veículo (km/l)
//A capacidade total do tanque de combustível (litros)
//A quantidade de combustível disponível no momento (litros)
//A distância da viagem planejada (km)

//Com essas informações, o programa deverá calcular:
//A autonomia máxima do carro (quantos quilômetros pode percorrer com um tanque cheio).
//A autonomia atual, baseada na quantidade de combustível disponível.
//Se a quantidade de combustível atual será suficiente para percorrer um determinado trajeto informado pelo usuário.

import java.util.Scanner;

public class exercicio10 {
    public static void main (String[] args) {

        double consumoMedio, combustivelMaximo, combustivelAtual, distanciaViagem;
        Scanner scan = new Scanner(System.in);

        System.out.printf ("\n\nQual o consumo médio do carro?\n");
        consumoMedio = scan.nextDouble();
        
        System.out.printf ("\nQual a capacidade total do tanque de combustível?\n");
        combustivelMaximo = scan.nextDouble();

        System.out.printf ("\nQual a quantidade de combustível atual?\n");
        combustivelAtual = scan.nextDouble();

        System.out.printf ("\nQual a distância da viagem?\n");
        distanciaViagem = scan.nextDouble();

        double autonomiaMaxima = consumoMedio * combustivelMaximo, autonomiaAtual = consumoMedio * combustivelAtual;
        double combustivelFalta = (distanciaViagem / consumoMedio) - (combustivelAtual);

        if (combustivelAtual >= distanciaViagem) {

            System.out.printf ("Você chegou no seu destino sem precisar abastecer\n");
            System.out.printf ("\nAutonomia Máxima: %.2f km\n", autonomiaMaxima);
            System.out.printf ("Autonomia Atual: %.2f km", autonomiaAtual);
        } else {
        
            System.out.printf ("Você precisará abastecer %.2fL antes de continuar a viagem", combustivelFalta);
            System.out.printf ("\nAutonomia Máxima: %.2f km\n", autonomiaMaxima);
            System.out.printf ("Autonomia Atual: %.2f km", autonomiaAtual);
        }
        scan.close();
    }
}
