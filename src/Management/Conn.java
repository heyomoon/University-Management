package Management;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/universitymanagementsystem?user=root&password=lostsoul");
            System.out.println("Connected to database");

            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}