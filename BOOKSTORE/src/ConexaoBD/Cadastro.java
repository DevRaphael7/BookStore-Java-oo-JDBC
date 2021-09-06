package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import ConexaoBD.LoadDB;

public class Cadastro extends LoadDB {
    public LoadDB db;
    
    public void Cadastrar(String url, Connection conn, String query){

        db.CarregandoBancoDeDados(url, conn);

        if(db.ExecutarQuery() == false) return;

        Statement stmt = null;
        ResultSet st = null;

        try{
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
        } catch(Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
}
