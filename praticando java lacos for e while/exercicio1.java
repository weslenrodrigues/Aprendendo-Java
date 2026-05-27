//Carla começou a praticar trilha e deseja saber quantos degraus precisará subir para chegar ao topo de uma
//escadaria. Ela sobe um degrau por vez e quer um programa que mostre sua subida até o topo.
//Sua tarefa é criar um programa que receba um número e simule a subida da escadaria.

import java.util.Scanner;

public class exercicio1 {

    public static void main (String[] args) {

        int totalDegraus;
        Scanner scan = new Scanner(System.in);

        System.out.printf ("Insira a quantidade total de degraus:\n");
        totalDegraus = scan.nextInt();

        for (int i = 1; i <= totalDegraus; i++) {

            System.out.printf ("Subindo degrau %d\n5", i);
        }

        System.out.printf ("Você chegou ao topo!");
        
        scan.close();
        }
}