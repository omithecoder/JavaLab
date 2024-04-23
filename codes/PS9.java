package codes;

import java.util.Scanner;

// Write Java Program to print reverse of the number
public class PS9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse : ");
        int num = in.nextInt();
        int res = 0;
        int reverse = 0;
        while (num>0)
        {
            res = num%10;
            reverse = (reverse + res)*10;
            num = num/10;

        }

        System.out.println("Reverse of the given number : ");
        System.out.println(reverse/10);

    }
}
