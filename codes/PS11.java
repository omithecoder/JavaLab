package codes;


import java.util.Scanner;

//Write a program to identify the given number is ArmStrong number or not
public class PS11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number which you want to check it is ArmStrong Number or not : ");
        int num = in.nextInt();
        int index = noOfDigit(num);
        if(ArmStrong(num,index)==num)
        {
            System.out.println("The Given Number is ArmStrong Number!");
        }
        else
        {
            System.out.println("The given number is NOT an Armstrong Number ");
        }
    }

    static int ArmStrong(int num,int index) {
        int res = 0;
        int result = 0;
        while(num>0)
        {
            res=num%10;
            result = result + (int)Math.pow(res,index);
            num=num/10;
        }

        return result;
    }

    static int noOfDigit(int num) {
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;
        }

        return count;
    }
}
