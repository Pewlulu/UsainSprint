package model;

import java.sql.*;

public class ConnectionProvider {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //com.mysql.cj.jdbc.Driver   for Mac
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usainsprint?useSSL=false", "root", "Uberuber@@@2");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}
