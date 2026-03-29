public class array {
    public static void main (String [] args) {

        final int TAMANHO = 5;

        int[] numeros = new int [TAMANHO];
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        numeros [0] = 5;
        numeros [1] = 10;
        numeros [2] = 15;
        numeros [3] = 20;
        numeros [4] = 25;


        for (int i = 0; i < num.length; i++) //num.leght conta a quantidade de posicoes em um array
        System.out.printf("\n\n\n%d", num[i]);
    }
}
