package codes;

// write code to take input of number of subject and it's marks and return the percentage of the student


import java.util.Scanner;

public class PS14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double percent = 0;
        System.out.println("Enter the number of subject do you have : ");
        int NumSubject = in.nextInt();
        int[] arr = new int[100];
        int sum=0;

        for(int i=0;i<NumSubject;i++)
        {
            System.out.print("Enter the marks in Subject "+(i+1)+" out of 100 : ");
            arr[i] = in.nextInt();
        }

        System.out.print("Your Pecentage : ");
        for(int i=0;i<NumSubject;i++)
        {
            sum = sum + arr[i];
        }

        percent = (double)((sum*100)/500);
        System.out.print(percent+"%");





    }
}
