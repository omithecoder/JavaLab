package codes.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectQuery {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded Successfully!");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprac","root","Omkar@2004");
        System.out.println("Connection Created!");

        PreparedStatement ps = con.prepareStatement("select * from user");
        ResultSet res = ps.executeQuery();

        while(res.next())
        {
            System.out.println(res.getString("id")+"\t"+res.getString("name")+"\t"+res.getString("email")+"\t"+res.getString("password")+"\t\n");
        }

        System.out.println("Data Received Successfully!");
        con.close();
        System.out.println("Connection Closed!");


    }


}
