public class Ebook extends Livro{
    
    private String tipoDeArquivo;
    private Autor autor;

    public void setTipoDeArquivo(String tipoDeArquivo){
        if(tipoDeArquivo == ".pdf" || tipoDeArquivo == "PDF" || tipoDeArquivo == ".epub" || tipoDeArquivo == "PUB") 
            this.tipoDeArquivo = tipoDeArquivo;
        else this.tipoDeArquivo = "Extensão de arquivo desconhecida";
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
    public boolean descontoPreco(double desconto){
        if(desconto <= 15) return true;
        return false;
    }

    public Ebook(Autor autor, String nome){
        super(autor, nome);
    }

}
