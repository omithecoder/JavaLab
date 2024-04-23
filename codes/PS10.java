package codes;

import java.util.Scanner;

// Write a program to check the number is pallindrome or not
public class PS10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number which you want check it is Pallindrome or not : ");
        int num = in.nextInt();
        if(num==reverse(num))
        {
            System.out.println("The number is Pallindrome!");
        }
        else
        {
            System.out.println("The number is not a Pallindrome!");
        }
    }

    static int reverse(int num)
    {
        int res = 0;
        int result = 0;
        while (num>0)
        {
            res = num%10;
            result = (result + res)*10;
            num = num/10;

        }

        return result/10;
    }
}
