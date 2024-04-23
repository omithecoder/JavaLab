package codes.JDBC;

import javax.security.auth.kerberos.EncryptionKey;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertQuery {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Load the JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("JDBC Driver Loaded Successfully!");

        // Create the connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprac","root","Omkar@2004");
        System.out.println("Database connection successful!");

        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your email : ");
        String email = sc.nextLine();
        System.out.println("Enter your password : ");
        String pass = sc.nextLine();

        System.out.println(name);
        System.out.println(email);
        System.out.println(pass);


        String encrypass = EncryptPass(pass);


//        now create the prepare statement
//        PreparedStatement ps =  con.prepareStatement("Insert into user (name,email,password) values('"+name+"','"+email+"','"+encrypass+"')");
//        Using Positional parameters
        PreparedStatement ps = con.prepareStatement("insert into user (name,email,password) values(?,?,?)");
        ps.setString(1,name);
        ps.setString(2,email);
        ps.setString(3,encrypass);

        int i = ps.executeUpdate();
        if(i>0)
        {
            System.out.println("Data inserted Successfully!");
        }
        else
        {
            System.out.println("Data not inserted into the database!");
        }

        con.close();
        System.out.println("Connection Close Successfully!");

    }

    private static String EncryptPass(String password) {
        String encryptedpassword = null;
        try
        {
            /* MessageDigest instance for MD5. */
            MessageDigest m = MessageDigest.getInstance("MD5");

            /* Add plain-text password bytes to digest using MD5 update() method. */
            m.update(password.getBytes());

            /* Convert the hash value into bytes */
            byte[] bytes = m.digest();

            /* The bytes array has bytes in decimal form. Converting it into hexadecimal format. */
            StringBuilder s = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            /* Complete hashed password in hexadecimal format */
            encryptedpassword = s.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return encryptedpassword;
    }
}
