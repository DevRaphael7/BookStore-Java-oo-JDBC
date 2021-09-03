public class Ebook extends Livro{
    
    private String tipoDeArquivo;
    private Autor autor;

    public void setTipoDeArquivo(String tipoDeArquivo){

        System.out.println(tipoDeArquivo + " " + tipoDeArquivo.length());
        if(tipoDeArquivo == ".pdf" || tipoDeArquivo == "PDF" || tipoDeArquivo == ".epub" || tipoDeArquivo == "PUB") 
            this.tipoDeArquivo = tipoDeArquivo;
        else this.tipoDeArquivo = "Extensão de arquivo inválida";
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public Autor getAutor(){
        return autor;
    }
    public String getTipoDeArquivo(){
        return tipoDeArquivo;
    }

    @Override
    public void informacoesDoLivro(){
        System.out.println("----(Informações do livro)");
        System.out.println("Nome: " + getNome());
        System.out.println("Nome do autor: " + autor.getNome());
        System.out.println("Quantidade de páginas: " + getQuantPages());
        System.out.println("Preço: " + getPreco());
        System.out.println("Editora: " + getEditora());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Extensão do ebook: " + getTipoDeArquivo());
        System.out.println("----");
    }

    @Override
    public boolean descontoPreco(double desconto){
        desconto = desconto / 100;
        if(desconto > 0.15) return true;
        return false;
    }

    public Ebook(Autor autor, String nome){
        super(autor, nome);
        tipoDeArquivo = " ";
    }

}
