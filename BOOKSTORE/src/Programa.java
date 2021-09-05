import java.util.Scanner;

public class Programa {

    public int escolhaLivro;
    public String nomeAutor;
    public String nomeLivro;
    public double preco;
    public String editora;
    public String descricao;
    public int quantPages;
    public String tipoDeArquivo;
    public boolean invalido;
    public int idade;
    public String email; 
    
    public void opcoesDoPrograma(){
        System.out.println("----");
        System.out.println("1) Cadastrar livro");
        System.out.println("2) Lista dos livros cadastrados");
        System.out.println("3) Informações do livro");
        System.out.println("4) Aplicar desconto");
        System.out.println("5) Sair do programa");
        System.out.println("----\n");
    }

    public void ebookOuLivroImpresso(Scanner input){
        System.out.println("(1) Ebook ou Livro (2)Impresso: ");
        this.escolhaLivro = input.nextInt();
    }

    public void cadastrandoOLivro(Scanner input){

        ebookOuLivroImpresso(input);
        
        //Informações sobre o LIVRO
        System.out.println("Nome do autor do livro: ");
        this.nomeAutor = input.next();    

        System.out.println("Nome do livro: ");
        this.nomeLivro = input.next();

        System.out.println("Preço do livro: ");
        this.preco = input.nextDouble();

        System.out.println("Editora do livro: ");
        this.editora = input.next();

        System.out.println("Descrição do livro: ");
        this.descricao = input.next();

        System.out.println("Quantidade de páginas: ");
        this.quantPages = input.nextInt();

        if(this.escolhaLivro == 1){
            System.out.println("Extensão do arquivo (EBOOK): ");
            this.tipoDeArquivo = input.next();

            if(this.tipoDeArquivo == " "){
                System.out.println("Tipo de arquivo inválido");
                this.invalido = false;
            }
        }

        //Informações sobre o autor
        System.out.println("Idade do autor: ");
        this.idade = input.nextInt();

        System.out.println("Email do autor: ");
        this.email = input.next();
    }

    public Programa(){
        this.invalido = true;
    }
}
