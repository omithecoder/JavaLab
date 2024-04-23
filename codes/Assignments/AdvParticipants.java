package codes.Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AdvParticipants {

    static int counter = 1000;
    String Name;
    String Branch;
    long MobNo;

    String RegistrationID;

    AdvParticipants(String name,String branch,long phoNum)
    {
        counter++;
        this.Name=name;
        this.MobNo = phoNum;
        this.Branch = branch;
        this.RegistrationID = name+counter;
    }

    public String getName()
    {
        return this.Name;
    }

    public long getMobNo() {
        return MobNo;
    }

    public String getBranch() {
        return Branch;
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {

        boolean loop=true;
        int ch;
        int i=0;
        Scanner in = new Scanner(System.in);
        Participants[] Student = new Participants[100];
        System.out.println("Welcome To Registration of VIT Melange!!");
        System.out.println("Proceed by Selecting the following options : ");
        while (loop) {
            System.out.println("\n1) Register Participant \n2) Get Participant Name \n3) Get Participant Mobile Number \n4) Get Total Number of Participant \n5) Get All Participants \n6) Exit");
            ch = in.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.print("Enter your name : ");
                    String Name = in.next();
                    System.out.print("Enter your Branch : ");
                    String branch = in.next();
                    System.out.print("Enter your Mobile Number : ");
                    long MobNo = in.nextLong();
                    Student[i] = new Participants(Name,MobNo,branch);
                    System.out.println("Hii "+Student[i].getParticipant_Name()+"! Your RegistrationID is "+Student[i].getRegistrationId());
                    i++;
                    break;

                case 2:
                    System.out.println("Enter Participant Registration ID : ");
                    String reg = in.next();
                    System.out.println(Arrays.toString(reg.split("1",2)));

                    break;


            }
        }



    }
}
