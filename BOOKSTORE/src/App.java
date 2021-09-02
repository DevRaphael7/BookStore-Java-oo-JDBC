import java.util.Scanner;

public class App {
    public static void main(String[] args){

        boolean looping = true;
        int escolha = 0;

        // Referenciando o objeto Autor e as subclasses da super classe Livro.
        Autor autor = new Autor(" ");
        Livro ebook = new Ebook(autor, "Nome do Autor");
        Livro livroImpresso = new LivroImpresso(autor, "Nome do Autor");

        /* --- Variáveis para a classe Livro --- */
        String nomeLivro = " ", editora = " ", descricao = " ", tipoDeArquivo = " ";
        int quantPages = 0;
        double preco = 0;
        /* --- Variáveis para a classe Autor --- */
        String nomeAutor = " ", email = " ";
        int idade = 0;

        Scanner input = new Scanner(System.in);

        String escolhaLivro = " ";

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
                    nomeAutor = input.next();    

                    System.out.println("Nome do livro: ");
                    nomeLivro = input.next();

                    System.out.println("Preço do livro: ");
                    preco = input.nextDouble();

                    System.out.println("Editora do livro: ");
                    editora = input.next();

                    System.out.println("Descrição do livro: ");
                    descricao = input.next();

                    System.out.println("Quantidade de páginas: ");
                    quantPages = input.nextInt();

                    //Informações sobre o autor
                    System.out.println("Idade do autor: ");
                    idade = input.nextInt();

                    System.out.println("Email do autor: ");
                    email = input.next();

                    System.out.println("Ebook ou Livro Impresso: ");
                    escolhaLivro = input.next();

                    switch(escolhaLivro){
                        case "Ebook":
                            ebook.setNome(nomeLivro);
                            autor.setNome(nomeAutor);
                            autor.setIdade(idade);
                            autor.setEmail(email);
                            ebook.setAutor(autor);
                            ebook.setEditora(editora);
                            ebook.setDescricao(descricao);
                            ebook.setPreco(preco);
                            ebook.setQuantPages(quantPages);
                            
                            ebook.informacoesDoLivro();
                        break;
                        case "Livro Impresso":
                    
                            livroImpresso.setNome(nomeLivro);
                            autor.setNome(nomeAutor);
                            autor.setIdade(idade);
                            autor.setEmail(email);
                            livroImpresso.setAutor(autor);
                            livroImpresso.setEditora(editora);
                            livroImpresso.setDescricao(descricao);
                            livroImpresso.setPreco(preco);
                            livroImpresso.setQuantPages(quantPages);

                            livroImpresso.informacoesDoLivro();
                        break;
                        default:
                            System.out.println("Você deve digitar uma das duas opções (Ebook ou Livro Impresso)!");
                        break;
                    }

                break;
                case 4:
                    escolhaLivro = input.next();

                    if(escolhaLivro == "Ebook" ){

                        System.out.println("Aplicar desconto de: ");
                        double desconto = input.nextDouble();
                        double novoValor = 0;

                        if(ebook.descontoPreco(desconto)) 
                            novoValor = ebook.getPreco() - (ebook.getPreco() * (desconto * ebook.getPreco()));
                        else break;

                    }else if(escolhaLivro == "Livro Impresso"){

                        System.out.println("Aplicar desconto de: ");
                        double desconto = input.nextDouble();
                        double novoValor = 0;

                        if(livroImpresso.descontoPreco(desconto)) 
                            novoValor = livroImpresso.getPreco() - (livroImpresso.getPreco() * (desconto * livroImpresso.getPreco()));
                        else break;

                    }
                break;
                case 5:
                    looping = false;
                break;
            }
            
        }

        input.close();

    }
}
