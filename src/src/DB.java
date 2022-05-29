
package src;

import java.sql.*;

public class DB {
   
    static Connection com = null;
    
    public static Connection getConnection(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            com = DriverManager.getConnection("jdbc:mysql://localhost:3306/whc","pbr","pbr@27962");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return com;
    }
}
