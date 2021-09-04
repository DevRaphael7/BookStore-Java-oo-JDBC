import java.util.Scanner;

public class App {
    public static void main(String[] args){

        boolean looping = true;
        int escolha = 0;

        // Referenciando o objeto Autor e as subclasses da super classe Livro.
        Autor autor = new Autor("");
        Ebook ebook = new Ebook(autor, "Nome do Autor");
        Livro livroImpresso = new LivroImpresso(autor, "Nome do Autor");
        Programa program = new Programa();

        /* --- Variáveis para a classe Livro --- */
        String nomeLivro = " ", editora = " ", descricao = " ", tipoDeArquivo = " ";
        int quantPages = 0;
        double preco = 0;
        /* --- Variáveis para a classe Autor --- */
        String nomeAutor = " ", email = " ";
        int idade = 0;

        boolean invalido = true;

        Scanner input = new Scanner(System.in);

        int escolhaLivro = 0;

        while(looping){
            
            program.opcoesDoPrograma();
            escolha = input.nextInt();

            switch(escolha){
                case 1:

                    program.ebookOuLivroImpresso(input, escolhaLivro);

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

                    if(escolhaLivro == 1){
                        System.out.println("Extensão do arquivo (EBOOK): ");
                        tipoDeArquivo = input.next();

                        if(tipoDeArquivo == " "){
                            System.out.println("Tipo de arquivo inválido");
                            invalido = false;
                        }
                    }

                    //Informações sobre o autor
                    System.out.println("Idade do autor: ");
                    idade = input.nextInt();

                    System.out.println("Email do autor: ");
                    email = input.next();

                    if(invalido){

                        switch(escolhaLivro){
                            case 1:
                                ebook.setNome(nomeLivro);
                                autor.setNome(nomeAutor);
                                autor.setIdade(idade);
                                autor.setEmail(email);
                                autor.informacoesDoAutor();
                                ebook.setAutor(autor);
                                ebook.setEditora(editora);
                                ebook.setDescricao(descricao);
                                ebook.setPreco(preco);
                                ebook.setQuantPages(quantPages);
                                ebook.setTipoDeArquivo(tipoDeArquivo);
                                
                                ebook.informacoesDoLivro();
                            break;
                            case 2:
                        
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

                    }
                break;
                case 3:

                    program.ebookOuLivroImpresso(input, escolhaLivro);

                    if (escolhaLivro == 1) ebook.informacoesDoLivro();
                    else if (escolhaLivro == 2) livroImpresso.informacoesDoLivro();
                    else System.out.println("Escolha inválida");

                break;
                case 4:
                    program.ebookOuLivroImpresso(input, escolhaLivro);

                    if (escolhaLivro == 1 ) {

                        System.out.println("Aplicar desconto de: ");
                        double desconto = input.nextDouble();

                        if (ebook.descontoPreco(desconto)) {
                            desconto = ((desconto/100) * ebook.getPreco());
                            desconto = ebook.getPreco() - desconto;
                            ebook.setPreco(desconto);
                        } else break;

                    } else if(escolhaLivro == 2) {

                        System.out.println("Aplicar desconto de: ");
                        double desconto = input.nextDouble();
            
                        if (livroImpresso.descontoPreco(desconto)) {
                            desconto = ((desconto/100) * livroImpresso.getPreco());
                            desconto = livroImpresso.getPreco() - desconto;
                            livroImpresso.setPreco(desconto);
                        } else break;

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
