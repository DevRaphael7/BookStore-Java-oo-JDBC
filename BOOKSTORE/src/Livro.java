public class Livro {
    
    private String nome;
    private int quantPages;
    private double preco;
    private String editora;
    private String descricao;
    private Autor autor;
    
    public void setNome(String nome){
        if(nome == "") this.nome = "Nome invalido!";
        else
            this.nome = nome;
    }

    public void setQuantPages(int quantPages){
        if(quantPages == 0) this.quantPages = 0;
        else 
            this.quantPages = quantPages;
    }

    public void setPreco(double preco){
        if(preco == 0) this.preco = 0;
        else 
            this.preco = preco;
    }

    public void setEditora(String editora){
        if(editora == "") this.editora = "Nome invalido!";
        else 
            this.editora = editora;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantPages(){
        return quantPages;
    }

    public double getPreco(){
        return preco;
    }

    public String getEditora(){
        return editora;
    }

    public String getDescricao(){
        return descricao;
    }

    public Autor getNomeDoAutor(){
        return autor;
    }

    public void informacoesDoLivro(){
        System.out.println("----(Informações do livro)");
        System.out.println("Nome: " + getNome());
        System.out.println("Nome do autor: " + autor.getNome());
        System.out.println("Quantidade de páginas: " + getQuantPages());
        System.out.println("Preço: " + getPreco());
        System.out.println("Editora: " + getEditora());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("----");
    }

    public boolean descontoPreco(double desconto){
        desconto = desconto / 100;
        if(desconto <= 0.30) return true;
        return false;
    }

    public Livro(Autor autor, String nome){
        this.autor = autor;
        this.nome = nome;
        this.preco = 0;
        this.editora = " ";
    }

}
