package codes.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;




public class ToDoList {



    public static void main(String[] args) throws Exception {
        int Auth =-1;
        Scanner sc = new Scanner(System.in);
        while (Auth<0) {
            System.out.println("📃 Todo_List 📃");
            System.out.println("Choose the following operation : ");
            System.out.println("1) Login \n2) Register");
            int opt1 = sc.nextInt();

            switch (opt1) {
                case 1:
                    Auth = login();
                    break;
                case 2:
                    register();
                    break;
                default:
                    System.out.println("Invalide Input!");
            }
        }
        while(Auth>0)
        {
            System.out.println("Choose the following operation : ");
            System.out.println("1) Add Task \n2) View Task \n3) Update Task \n4) Delete Task \n5) Exit");
            int opt2 = sc.nextInt();
            switch (opt2)
            {
                case 1:
                    addTask(Auth);
                    break;
                case 2:
                    viewTask(Auth);
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    Auth = -1;
                    System.out.println("Logged Out Successfully!😃");
                    break;
                default:
                    System.out.println("Invalide Input!");
            }
        }



    }

    private static void deleteTask() throws Exception {

        DBConnection db = new DBConnection();
        Connection con = db.connect();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Task ID : ");
        int taskid = sc.nextInt();
        PreparedStatement ps = con.prepareStatement("delete from tasks where taskid = ?");
        ps.setInt(1,taskid);
        int res = ps.executeUpdate();
        if(res>0)
        {
            System.out.println("Task Deleted Successfully!");
        }
        else
        {
            System.out.println("Task not deleted!");
        }
        con.close();

    }

    private static void updateTask() throws Exception{
        DBConnection db = new DBConnection();
        Connection con = db.connect();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Task ID : ");
        int taskid = sc.nextInt();
        System.out.println("Choose the following operation : ");
        System.out.println("1) Update Task \n2) Update Due Date \n3) Update Priority \n4) Update Status");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                sc.nextLine();
                System.out.println("Enter the Task : ");
                String task = sc.nextLine();
                PreparedStatement ps = con.prepareStatement("update tasks set task = ? where taskid = ?");
                ps.setString(1, task);
                ps.setInt(2, taskid);
                int res = ps.executeUpdate();
                if (res > 0) {
                    System.out.println("Task Updated Successfully!");
                } else {
                    System.out.println("Task not updated!");
                }
                break;
            case 2:
                System.out.println("Enter the Due day : ");
                int days = sc.nextInt();
                Date date = new Date();
                date.setDate(date.getDate() + days);
                PreparedStatement ps1 = con.prepareStatement("update tasks set due_date = ? where taskid = ?");
                ps1.setDate(1, new java.sql.Date(date.getTime()));
                ps1.setInt(2, taskid);
                int res1 = ps1.executeUpdate();
                if (res1 > 0) {
                    System.out.println("Due Date Updated Successfully!");
                } else {
                    System.out.println("Due Date not updated!");
                }
                break;
            case 3:
                String[] priority = {"High", "Medium", "Low"};
                System.out.println("Select the Priority : ");
                System.out.println("1) High \n2) Medium \n3) Low");
                int prior = sc.nextInt();
                PreparedStatement ps2 = con.prepareStatement("update tasks set priority = ? where taskid = ?");
                ps2.setString(1, priority[prior - 1]);
                ps2.setInt(2, taskid);
                int res2 = ps2.executeUpdate();
                if (res2 > 0) {
                    System.out.println("Priority Updated Successfully!");
                } else {
                    System.out.println("Priority not updated!");
                }
                break;
            case 4:
                System.out.println("Enter the Status : ");
                String status = sc.nextLine();
                PreparedStatement ps3 = con.prepareStatement("update tasks set status = ? where taskid = ?");
                ps3.setString(1, status);
                ps3.setInt(2, taskid);
                int res3 = ps3.executeUpdate();
                if (res3 > 0) {
                    System.out.println("Status Updated Successfully!");
                } else {
                    System.out.println("Status not updated!");
                }
                break;
            default:
                System.out.println("Invalid Input!");
        }
        con.close();
    }

    private static void viewTask(int userid) throws Exception {
        DBConnection db = new DBConnection();
        Connection con = db.connect();
        PreparedStatement ps = con.prepareStatement("select * from tasks where userid = ?");
        ps.setInt(1,userid);
        var res = ps.executeQuery();
            System.out.println("\n\n-------📃 Task List 📃-------\n\n");

        while(res.next())
        {
            System.out.println("Task ID : "+res.getInt(1));
            System.out.println("Task : "+res.getString(4));
            System.out.println("Due Date : "+res.getString(3));
            System.out.println("Priority : "+res.getString(5));
            System.out.println("Status : "+res.getString(6));
            System.out.println("Created : "+res.getTimestamp(7));
            System.out.println("Updated : "+res.getTimestamp(8));

            System.out.println("\n\n-----------------------------\n\n");
        }



        con.close();

    }

    private static void addTask(int userid) throws Exception {
        DBConnection db = new DBConnection();
        Connection con = db.connect();
        String[] priority = {"High","Medium","Low"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Task : ");
        String task = sc.nextLine();
        System.out.println("Enter the Due day : ");
        int days = sc.nextInt();
        System.out.println("Select the Priority : ");
        System.out.println("1) High \n2) Medium \n3) Low");

        Date date = new Date();
        date.setDate(date.getDate()+days);

        int prior = sc.nextInt();
        PreparedStatement ps = con.prepareStatement("insert into tasks (task,due_date,priority,userid,status) values(?,?,?,?,?)");
        ps.setString(1,task);
        ps.setDate(2,new java.sql.Date(date.getTime()));
        ps.setString(3,priority[prior-1]);
        ps.setInt(4,userid);
        ps.setString(5,"Pending");
        int res = ps.executeUpdate();
        if(res>0)
        {
            System.out.println("Task Added Successfully!");
        }
        else
        {
            System.out.println("Task not added!");
        }
        con.close();

    }

    private static int login() throws Exception {
        DBConnection db = new DBConnection();
        Connection con = db.connect();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String email = sc.nextLine();
        System.out.println("Enter your Password : ");
        String pass = sc.nextLine();

        PreparedStatement ps = con.prepareStatement("select * from user where email = ? and password = ?");
        ps.setString(1,email);
        ps.setString(2,pass);
        var res = ps.executeQuery();
        if(res.next())
        {
            System.out.println("Login Successful!");
            ps = con.prepareStatement("select userid from user where email = ? and password = ?");
            ps.setString(1,email);
            ps.setString(2,pass);
            res = ps.executeQuery();
            res.next();
            return res.getInt(1);
        }

            System.out.println("Login Failed!");
            return -1;

    }

    private static void register() throws Exception {

        DBConnection db = new DBConnection();
        Connection con = db.connect();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String email = sc.nextLine();
        System.out.println("Enter your Password : ");
        String pass = sc.nextLine();

        PreparedStatement ps = con.prepareStatement("insert into user (email,password) values(?,?)");
        ps.setString(1,email);
        ps.setString(2,pass);

        int i = ps.executeUpdate();
        if(i>0)
        {
            System.out.println("User Registered Successfully!");
        }
        else
        {
            System.out.println("User not registered!");
        }
        con.close();
    }
}
