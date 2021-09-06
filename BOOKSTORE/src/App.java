import java.util.Scanner;

import ConexaoBD.LoadDB;

public class App {
    public static void main(String[] args){

        boolean looping = true;
        int escolha = 0;

        // Referenciando o objeto Autor e as subclasses da super classe Livro.
        Autor autor = new Autor("");
        Ebook ebook = new Ebook(autor, "Nome do Autor");
        Livro livroImpresso = new LivroImpresso(autor, "Nome do Autor");
        Programa program = new Programa();

        Scanner input = new Scanner(System.in);

        while(looping){
            
            program.opcoesDoPrograma();
            escolha = input.nextInt();

            switch(escolha){
                case 1:
                
                    program.cadastrandoOLivro(input);

                    if(program.invalido){

                        switch(program.escolhaLivro){
                            case 1:
                                ebook.setNome(program.nomeLivro);
                                autor.setNome(program.nomeAutor);
                                autor.setIdade(program.idade);
                                autor.setEmail(program.email);
                                ebook.setAutor(autor);
                                ebook.setEditora(program.editora);
                                ebook.setDescricao(program.descricao);
                                ebook.setPreco(program.preco);
                                ebook.setQuantPages(program.quantPages);
                                ebook.setTipoDeArquivo(program.tipoDeArquivo);
                                
                                ebook.informacoesDoLivro();
                            break;
                            case 2:
                        
                                livroImpresso.setNome(program.nomeLivro);
                                autor.setNome(program.nomeAutor);
                                autor.setIdade(program.idade);
                                autor.setEmail(program.email);
                                livroImpresso.setAutor(autor);
                                livroImpresso.setEditora(program.editora);
                                livroImpresso.setDescricao(program.descricao);
                                livroImpresso.setPreco(program.preco);
                                livroImpresso.setQuantPages(program.quantPages);

                                livroImpresso.informacoesDoLivro();
                            break;
                            default:
                                System.out.println("Você deve digitar uma das duas opções (Ebook ou Livro Impresso)!");
                            break;
                        }

                    }
                break;
                case 3:

                    program.ebookOuLivroImpresso(input);

                    if (program.escolhaLivro == 1) ebook.informacoesDoLivro();
                    else if (program.escolhaLivro == 2) livroImpresso.informacoesDoLivro();
                    else System.out.println("Escolha inválida");

                break;
                case 4:
                    program.ebookOuLivroImpresso(input);

                    if (program.escolhaLivro == 1 ) {

                        System.out.println("Aplicar desconto de: ");
                        double desconto = input.nextDouble();

                        if (ebook.descontoPreco(desconto)) {
                            desconto = ((desconto/100) * ebook.getPreco());
                            desconto = ebook.getPreco() - desconto;
                            ebook.setPreco(desconto);
                        } else break;

                    } else if(program.escolhaLivro == 2) {

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
