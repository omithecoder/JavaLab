package codes.Assignments;

import java.sql.*;
import java.util.Scanner;


public class Assignment6 {
//    jdbc -> java database connectivity (for java)
//    odbc -> open database connectivity (for all language)

//    we can connect any sort of sql or NoSql database
//    Perform CRUD operations

//    TO use sql database "import package - sql"
//    Load & register the driver "mysql.connecter.jar"
//    class forName("com.jdbc.mysql.cj.Driver")
//    create connection
//    string url = "url for database address"
//    string username ="root"
//    string password = "password"
//    Connection conn = DriverManage.getConnection(url,username,password)

//    Create the statement (is connection is established or not)



        public static void main(String[] args) throws SQLException {

            String url="jdbc:mysql://localhost:3306/javadb";
            String user="root";
            String pwd="Omkar@2004";
            Connection con=null;

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter rollNo: ");
            int rno = sc.nextInt();

            System.out.println("Enter Sname: ");
            String name = sc.next();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection(url,user,pwd);
                Statement st=con.createStatement();
                System.out.println("connection successful \n ");
                String sqlInsert="insert into studentdata values('"+rno+"','"+name+"')";
                st.executeUpdate(sqlInsert);
                System.out.println("record inserted successfully");


                String sql="select * from studentdata";
                ResultSet rs= st.executeQuery(sql);
                while(rs.next()) {
                    System.out.println("RollNo: "+rs.getInt(1));
                    System.out.println("Sname: "+rs.getString(2));

                }

//			 String sqlupdate="update student set name=' "+name+"' where rollno='"+rno+"' ";
//			 st.executeUpdate(sqlupdate);
//			 System.out.println("record updated successfully");
//////

//			 String sqldelete="delete from student where rollno=1";
//			 st.executeUpdate(sqldelete);
//			 System.out.println("record deleted successfully");
//
//			 System.out.println("Enter the rollno  ");
//			 	 String m = sc.nextLine();
//			 String usql = "delete from student WHERE rollno =?";
//
//			 java.sql.PreparedStatement pst = con.prepareStatement(usql);
//	          pst.setString(1,m);
//	    	  pst.executeUpdate();
//	    	  System.out.println("deleted ");


            }
            catch(Exception ex) {
                System.out.println(ex);
            }

            finally {
                con.close();}
        }

    }

