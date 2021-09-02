import java.util.Scanner;

public class App {
    public static void main(String[] args){

        boolean looping = true;
        int escolha = 0;

        Autor autor = new Autor(" ");
        Livro book = new Livro(autor, "Nome do Autor");
        Scanner input = new Scanner(System.in);

        while(looping){

            System.out.println("----");
            System.out.println("1) Cadastrar livro");
            System.out.println("2) Lista dos livros cadastrados");
            System.out.println("3) Remover livros");
            System.out.println("4) Aplicar desconto");
            System.out.println("5) Sair do programa");
            System.out.println("----\n");

            escolha = input.nextInt();

            switch(escolha){
                case 1:

                    //Informações sobre o LIVRO
                    System.out.println("Nome do autor do livro: ");
                    autor.setNome(input.next());

                    System.out.println("Nome do livro: ");
                    book.setNome(input.next());

                    System.out.println("Preço do livro: ");

                    book.setPreco(input.nextFloat());

                    System.out.println("Editora do livro: ");
                    book.setEditora(input.next());

                    System.out.println("Descrição do livro: ");
                    book.setDescricao(input.next());

                    System.out.println("Quantidade de páginas: ");
                    book.setQuantPages(input.nextInt());

                    //Informações sobre o autor
                    System.out.println("Idade do autor: ");
                    autor.setIdade(input.nextInt());

                    System.out.println("Email do autor: ");
                    autor.setEmail(input.next());

                    book.informacoesDoLivro();
                    
                break;
                case 4:
                    
                    System.out.println("Aplicar desconto de: ");
                    double desconto = input.nextDouble();
                    double novoValor = 0;

                    if(book.descontoPreco(desconto)) 
                        novoValor = book.getPreco() - (book.getPreco() * (desconto * book.getPreco()));
                    else break;

                break;
                case 5:
                    looping = false;
                break;
            }
            
        }

        input.close();

    }
}
