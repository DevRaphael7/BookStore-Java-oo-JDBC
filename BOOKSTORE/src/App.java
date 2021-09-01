import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        boolean looping = true;
        String nome, nomeAutor, editora, descricao, endereco;
        int quantPages, cpf, idade;
        double price;

        Scanner input = new Scanner(System.in);

        while(looping){

            System.out.println("----");
            System.out.println("1) Cadastrar livro");
            System.out.println("2) Lista dos livros cadastrados");
            System.out.println("3) Remover livros");
            System.out.println("4) Aplicar desconto");
            System.out.println("5) Sair do programa");
            System.out.println("----\n");

            int escolha = input.nextInt();

            switch(escolha){
                case 1:

                    //Informações sobre o LIVRO
                    System.out.println("Nome do livro: ");
                    nome = input.next();

                    System.out.println("Autor do livro");
                    nomeAutor = input.next();

                    System.out.println("Quantidade de páginas");
                    quantPages = input.nextInt();

                    System.out.println("Preço: ");
                    price = input.nextDouble();

                    System.out.println("Editora: ");
                    editora = input.next();

                    System.out.println("Descrição: ");
                    descricao = input.next();

                    //Informações sobre o Autor
                    System.out.println("CPF do autor: ");
                    cpf = input.nextInt();

                    System.out.println("Endereço do autor: ");
                    endereco = input.next();

                    System.out.println("Idade do autor: ");
                    idade = input.nextInt();

                    Autor autor = new Autor(nomeAutor, idade);
                    Livro book = new Livro(autor, editora, price);
                break;
            }
            
        }

        input.close();

    }
}
