package ConexaoBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// ALTER TABLE Livro ADD extensaoDeArquivo varchar(4);

public class ConexaoDB {
    
    Connection conn;
    String urlDataBase;
    Statement statement;
    ResultSet rs;

    String url;
    String user;
    String password;

    
    public void selectValues(String query){

        try{
            // Com isso faço a conexão com o banco de dados
            conn = DriverManager.getConnection(url, user, password);

            //Executar comando (QUERY)
            statement = conn.createStatement();
            rs = statement.executeQuery(query);

            while(rs.next()){

                System.out.println("----\n");
                System.out.println("ID: " + rs.getString("id"));
                System.out.println("Quantidade de páginas: " + rs.getString("quantPages"));
                System.out.println("Preço: " + rs.getString("preco"));
                System.out.println("Editora: " + rs.getString("editora"));
                System.out.println("Descrição: " + rs.getString("descricao"));
                System.out.println("Autor: " + rs.getString("autor"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Tipo de arquivo: " + rs.getString("tipoDeLivro"));
                if (rs.getString("tipoDeLivro") == "Ebook") System.out.println("Extensão de arquivo: " + rs.getString("extensaoDeArquivo"));
                System.out.println("----\n");


                if (rs.getString("id").toString() == null || rs.getString("id").toString() == " ") System.out.println("Não tem livros no banco de dados!");
                
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void insertValues(String query){

        try{
            // Com isso faço a conexão com o banco de dados
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Banco de dados conectado com sucesso!");

            //Executar comando (QUERY)
            statement = conn.createStatement();
            statement.executeUpdate(query);
            

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public ConexaoDB(String url, String user, String password){
        this.url = url;
        this.user = user;
        this.password = password;
    }
}
