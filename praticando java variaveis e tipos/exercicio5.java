//Título
//Autor
//Número de páginas
//Preço de um livro
//Categoria do livro As categorias disponíveis são:
//F - Ficção
//N - Não-ficção
//T - Tecnologia
//H - História
//Escreva um programa que armazene em variáveis as informações de um livro e com base na 
//categoria armazenada exiba uma mensagem de confirmação de acordo com o que foi escolhido.
import java.util.Scanner;

public class exercicio5 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int menu;

        System.out.printf ("\n\n\nCategorias disponíveis:\n");
        System.out.printf ("F - Ficção\n");
        System.out.printf ("N - Não ficção\n");
        System.out.printf ("T - Tecnologia\n");
        System.out.printf ("H - História\n\n");
        menu = scan.next().charAt(0);

        switch (menu) {
            case 'F':
                
                Livro harryPotter = new Livro();
                harryPotter.titulo = "Harry Potter";
                harryPotter.autor = "J.K Rowling";
                harryPotter.paginasLivro = 309;
                harryPotter.precoLivro = 50;
                harryPotter.categoriaLivro = 'F';

                System.out.printf ("\n\n\nTitulo: %s\n", harryPotter.titulo);
                System.out.printf ("Autor: %s\n", harryPotter.autor);
                System.out.printf ("Quantidade de Páginas: %d\n", harryPotter.paginasLivro);
                System.out.printf ("Preço do Livro: %d\n", harryPotter.precoLivro);
                System.out.printf ("Categoria do Livro: %s\n\n\n", harryPotter.categoriaLivro);



                break;
        
            case 'N':

                Livro anneFrank = new Livro();
                anneFrank.titulo = "O Diário de Anne Frank";
                anneFrank.autor = "Anne Frank";
                anneFrank.paginasLivro = 352;
                anneFrank.precoLivro = 45;
                anneFrank.categoriaLivro = 'N';

                System.out.printf ("\n\n\nTitulo: %s\n", anneFrank.titulo);
                System.out.printf ("Autor: %s\n", anneFrank.autor);
                System.out.printf ("Quantidade de Páginas: %d\n", anneFrank.paginasLivro);
                System.out.printf ("Preço do Livro: %d\n", anneFrank.precoLivro);
                System.out.printf ("Categoria do Livro: %s\n\n\n", anneFrank.categoriaLivro);

                break;

            case 'T':

                Livro cleanCode = new Livro();
                cleanCode.titulo = "Clean Code";
                cleanCode.autor = "Robert C. Martin";
                cleanCode.paginasLivro = 464;
                cleanCode.precoLivro = 90;
                cleanCode.categoriaLivro = 'T';

                System.out.printf ("\n\n\nTitulo: %s\n", cleanCode.titulo);
                System.out.printf ("Autor: %s\n", cleanCode.autor);
                System.out.printf ("Quantidade de Páginas: %d\n", cleanCode.paginasLivro);
                System.out.printf ("Preço do Livro: %d\n", cleanCode.precoLivro);
                System.out.printf ("Categoria do Livro: %s\n\n\n", cleanCode.categoriaLivro);

                break;

            case 'H':

                Livro napoleaoBiografia = new Livro();
                napoleaoBiografia.titulo = "Napoleão: Uma Biografia";
                napoleaoBiografia.autor = "Andrew Roberts";
                napoleaoBiografia.paginasLivro = 976;
                napoleaoBiografia.precoLivro = 110;
                napoleaoBiografia.categoriaLivro = 'H';

                System.out.printf ("\n\n\nTitulo: %s\n", napoleaoBiografia.titulo);
                System.out.printf ("Autor: %s\n", napoleaoBiografia.autor);
                System.out.printf ("Quantidade de Páginas: %d\n", napoleaoBiografia.paginasLivro);
                System.out.printf ("Preço do Livro: %d\n", napoleaoBiografia.precoLivro);
                System.out.printf ("Categoria do Livro: %s\n\n\n", napoleaoBiografia.categoriaLivro);

                break;

            default:

            System.out.printf ("\n\nOpção de Categoria não encontrada.");
                break;
        }

        scan.close();
    }
}

class Livro {

    String titulo;
    String autor;
    int paginasLivro;
    int precoLivro;
    char categoriaLivro;    
}
