package ConexaoBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


// CREATE TABLE Livro( 
// 	id int not null UNIQUE AUTO_INCREMENT,
//     quantPages int not null,
//     preco float(3, 2) not null,
//     editora varchar(25) not null,
//     descricao varchar(255) not null,
//     autor varchar(30) not null,
//     PRIMARY KEY(id)
// );

// CREATE TABLE Ebook( 
// 	id int not null UNIQUE AUTO_INCREMENT,
//     quantPages int not null,
//     preco float(3, 2) not null,
//     editora varchar(25) not null,
//     descricao varchar(255) not null,
//     autor varchar(30) not null,
//     tipoDeArquivo varchar(32) not null,
//     PRIMARY KEY(id)
// );

// ALTER TABLE Livro ADD tipoDeLivro varchar(14) not null; 
// ALTER TABLE Livro ADD nome varchar(50) not null;

// INSERT INTO Livro VALUES (1, 119, 5, "Penguim Companhia", "Incapaz de compartilhar momentos de amizade e de compreender a magia do Natal, Ebenezer Scrooge só encontra refúgio na riqueza e na solidão. Até que, num 24 de dezembro, recebe a visita do fantasma de Jacob Marley, seu ex-sócio falecido há sete anos. É ele quem avisa a Scrooge que mais três espíritos o visitarão para lhe dar a chance de mudar seu triste fim e ser poupado de vagar a esmo depois de morto, como Marley. Assim, o Fantasma dos Natais Passados, o Fantasma do Natal Presente e o Fantasma dos Natais Futuros levarão o protagonista para uma viagem no tempo, mostrando-lhe que a generosidade é sempre a melhor escolha. Um dos livros mais carismáticos da literatura inglesa, Uma canção de Natal recebe o crédito por ter concebido a celebração desse evento como a entendemos hoje: uma ocasião para agradecer e ajudar o próximo.", " Charles Dickens", "Livro Impresso", "Uma canção de Natal");
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
                System.out.println(rs.getString("id"));

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
