
package UniversitySystem;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "sonar@2004");
            s = c.createStatement();
                                                             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

