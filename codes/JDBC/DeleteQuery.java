package codes.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteQuery {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded Successfully!");

        System.out.println("Enter your email : ");
        String email = sc.nextLine();

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprac","root","Omkar@2004");
        PreparedStatement ps = con.prepareStatement("Delete from user where email = ?");
        ps.setString(1,email);
        int res = ps.executeUpdate();

        if(res>0)
        {
            System.out.println("user deleted Successfully!");
        }
        else {
            System.out.println("User not deleted!");
        }

        con.close();
        System.out.println("Connection Closed!");





    }
}
