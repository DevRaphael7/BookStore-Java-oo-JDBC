public class Ebook extends Livro{
    
    private String tipoDeArquivo;

    void setTipoDeArquivo(String tipoDeArquivo){

        if(tipoDeArquivo != ".pdf" || tipoDeArquivo != ".epub") this.tipoDeArquivo = "Extensão de arquivo inválida";
        else
            this.tipoDeArquivo = tipoDeArquivo;
    }

    String getTipoDeArquivo(){
        return tipoDeArquivo;
    }

    @Override
    public boolean descontoPreco(double desconto){
        desconto = desconto / 100;
        if(desconto > 0.15) return true;
        return false;
    }

    public Ebook(Autor autor){
        super(autor);
    }


}
