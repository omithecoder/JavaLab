package codes;

//    Write java program to check whether given number is positive or negative

import java.util.Scanner;

public class PS2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number which you want to check whether it is +ve & -ve : ");
        int a = in.nextInt();
        if(a>0)
        {
            System.out.println("The Given Number is (+) Positive ");
        } else if (a<0) {
            System.out.println("The Given Number is (-) Negative ");
        }
        else
        {
            System.out.println("The given Number is (0) Zero");
        }

        in.close(); //Scanner close
    }
}
