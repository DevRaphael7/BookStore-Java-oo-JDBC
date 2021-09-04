import java.util.Scanner;

public class Programa {
    
    public void opcoesDoPrograma(){
        System.out.println("----");
        System.out.println("1) Cadastrar livro");
        System.out.println("2) Lista dos livros cadastrados");
        System.out.println("3) Informações do livro");
        System.out.println("4) Aplicar desconto");
        System.out.println("5) Sair do programa");
        System.out.println("----\n");
    }

    public void ebookOuLivroImpresso(Scanner input, int escolhaLivro){
        System.out.println("(1) Ebook ou Livro (2)Impresso: ");
        escolhaLivro = input.nextInt();
    }
}
