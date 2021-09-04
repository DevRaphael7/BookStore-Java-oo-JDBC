public class Autor {
    
    private String nome;
    private int idade;
    private String email;

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return nome;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

    int getIdade(){
        return idade;
    }

    void setEmail(String email){
        this.email = email;
    }

    String getEmail(){
        return email;
    }

    void email(String email){
        this.email = email;
    }

    public void informacoesDoAutor(){
        System.out.println("\n----(Informações do autor)");
        System.out.println("Nome do autor: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("E-mail: " + getEmail());
        System.out.println("----");
    }
    
    public Autor(String nome){
        this.nome = nome;
    }
}
