//João recebeu uma lista de valores representando as receitas de sua loja de roupas.
//Ele quer calcular a soma total dessas receitas para entender o desempenho financeiro semanal.

public class exercicio2 {
    
    public static void main (String[] args) {

        int soma = 0;
        int[] valores = {10, 20, 30, 40, 50};

        for (int i = 0; i < valores.length; i++) {

            soma += valores[i];
        }
        System.out.printf ("\n\nSoma total: %d", soma);
    }
}
