package codes.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    public Connection connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded Successfully!");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist","root","Omkar@2004");
        System.out.println("Database connection successful!");

        return con;
    }
}
