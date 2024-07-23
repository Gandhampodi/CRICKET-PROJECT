package Cricket;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class DBConnection {
    static Connection con;

    public static Connection createDBConnection() {

        String driver = "com.mysql.jdbc.Driver";

        String URL = "jdbc:mysql://localhost:3306/cricketer";
        String USER = "root"; // Update to your MySQL username
        String PASSWORD = "root123";
        {
            try {
                Class.forName(driver);
              con = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement stmt = con.createStatement();
                ResultSet res = stmt.executeQuery("select from cricket");
                while (res.next()) {
                    System.out.println("res.getInt(1)");
                    System.out.println("res.getString(2)");

                }
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return con;
    }
}




