package codes.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateQuery {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded Successfully!");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprac","root","Omkar@2004");
        System.out.println("Connected to database!");

        System.out.println("Enter your email : ");
        String email = sc.nextLine();
        System.out.println("Enter your new name : ");
        String name = sc.nextLine();

        PreparedStatement ps = con.prepareStatement("update user set name = ? where email = ?");
        ps.setString(1,name);
        ps.setString(2,email);

        int res = ps.executeUpdate();
        if(res>0)
        {
            System.out.println("Name updated successfully!");
        }
        else
        {
            System.out.println("Name not updated successfully!");
        }

        con.close();
        System.out.println("Connection closed successfully!");

    }
}
