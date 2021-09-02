public class LivroImpresso extends Livro{
    
    public LivroImpresso(Autor autor){
        super(autor);
    }

    public boolean descontoPreco(double desconto){
        desconto = desconto / 100;
        if(desconto > 0.15) return true;
        return false;
    }
}
