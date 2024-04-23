package codes.Assignments;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Participants {

    static int Counter =1000;
    String Participant_Name;
    long MobileNo;
    String Branch_of_participant;

    String registrationId;
    Participants(String n, long mobNo, String branch)
    {
        Counter++;
         this.registrationId= n+Counter;
         this.Participant_Name=n;
         this.Branch_of_participant = branch;
         this.MobileNo = mobNo;

    }


    public static int getCounter() {
        return Counter;
    }

    public long getMobileNo() {
        return MobileNo;
    }

    public String getBranch_of_participant() {
        return Branch_of_participant;
    }

    public String getParticipant_Name() {
        return Participant_Name;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public static void main(String[] args) {
        Participants[] std = new Participants[10];
        Scanner in = new Scanner(System.in);
        String Name;
        long MobNo;
        String branch;
        int i=1;



            in.reset();
            boolean loop=true;

            while(loop)
            {
                System.out.println("\n\n1) Create User \n2) List of User \n3) Exit ");
                int cho = in.nextInt();
                switch (cho)
                {
                    case 1:
                        System.out.print("Enter your name : ");
                        Name = in.next();
                        System.out.print("Enter your Branch : ");
                        branch = in.next();
                        System.out.print("Enter your Mobile Number : ");
                        MobNo = in.nextLong();
                        std[i] = new Participants(Name,MobNo,branch);
                        System.out.println("Hii "+std[i].getParticipant_Name()+"! Your RegistrationID is "+std[i].getRegistrationId());
                        i++;
                        break;


                    case 2:
                        System.out.println("User_ID \t\t User_Name");
                        int counter = Participants.Counter-1000;
                        for(int k=1;k<=counter;k++)
                        {
                            System.out.print(std[k].getRegistrationId() +"\t\t" + std[k].getParticipant_Name());
                            System.out.println();

//                            System.out.println(k);

                        }
//                        System.out.println(counter);

                        break;

                    case 3:
                        loop=false;
                        System.out.println("Thank You! Visit Again!");
                        break;


                    default:
                        System.out.println("Invalide Input!!");

                }


            }






    }
}
