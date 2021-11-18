package kata5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Kata5 {

    public static void main(String[] args) {
        connect();
    }

    private static void connect() {
        Connection conn;
        conn = null;
        try {
            String url;
            url = "jdbc:sqlite:Kata5.db";
            
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connexion a SQLite establecida");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                if (conn != null){
                    conn.close();
                }
            
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        
        }
    }
    
}
