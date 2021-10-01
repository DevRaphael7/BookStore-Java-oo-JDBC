public abstract class Livro {
    
    private String nome;
    private int quantPages;
    private double preco;
    private String editora;
    private String descricao;
    private Autor autor;
    
    public void setNome(String nome){
        if(nome == "") this.nome = "Nome inválido";
        else this.nome = nome;
    }

    public void setQuantPages(int quantPages){
        this.quantPages = quantPages;
    }

    public void setPreco(double preco){
            this.preco = preco;
    }

    public void setEditora(String editora){
        if(editora == "" || editora == " ") this.editora = "Nome invalido!";
        else this.editora = editora;
    }

    public void setDescricao(String descricao){
        if (descricao == "" || descricao == " ") this.descricao = "Sem descrição";
        else this.descricao = descricao;
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

    public String getNomeDoAutor(){
        return autor.getNome();
    }
    
    public void informacoesDoLivro(){
        System.out.println("----(Informações do livro)----");
        System.out.println("Nome: " + getNome());
        System.out.println("Nome do autor: " + autor.getNome());
        System.out.println("Quantidade de páginas: " + getQuantPages());
        System.out.println("Preço: " + getPreco());
        System.out.println("Editora: " + getEditora());
        System.out.println("Descrição: " + getDescricao());
        autor.informacoesDoAutor();
    }

    public boolean descontoPreco(double desconto){
        if(desconto <= 30) return true;
        return false;
    }

    public Livro(Autor autor, String nome){
        this.autor = autor;
        this.nome = nome;
        this.preco = 0;
        this.editora = " ";
    }

}
