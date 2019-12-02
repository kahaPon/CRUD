/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author nierema_sd2081
 */
public class MyConnection {
    
    
    public static Connection getConnection()
    {
        Connection conn = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/niere","root","");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
    
}
