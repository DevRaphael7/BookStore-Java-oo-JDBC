package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class LoadDB {
    private boolean erro;

    public void CarregandoBancoDeDados(String url, Connection conn) {

        conn = null;

        try {
            conn = DriverManager.getConnection(url);
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex){
            System.out.println("SQLException: " + ex.getMessage());
            this.erro = false;
        }
    }

    public Boolean ExecutarQuery(){
        return erro;
    }
    
    public LoadDB() {
        this.erro = true;
    }

        // try {
        //     conn = DriverManager.getConnection("jdbc:mysql://localhost/j_lan?" + "user=raphael&password=159357456852DB$");
        //     Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

        //     stmt = conn.createStatement();
        //     String query = "SELECT * FROM teste";
        //     st = stmt.executeQuery(query);

        //     while(st.next()){
        //         System.out.println(st.getInt("id"));
        //         System.out.println(st.getString("nome"));
        //     }

        // } catch (Exception ex) {
        //     System.out.println("SQLException: " + ex.getMessage());
        //     // System.out.println("SQLState: " + ex.getSQLState());
        //     // System.out.println("VendorError: " + ex.getErrorCode());
        // }
    
}