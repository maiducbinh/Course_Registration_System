package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crs_db?useSSL=false", "root", "Binh03bg");

        if (conn != null) {
            System.out.println("Connection established");
        } else {
            System.out.println("No database found");
        }
        return conn;
    }
    
//    public static void main(String[] args) throws SQLException {
//        Connection conn = getConnection();
//        if (conn != null) {
//            System.out.println("Connection established");
//        } else {
//            System.out.println("No database found");
//        }
//    }
}
