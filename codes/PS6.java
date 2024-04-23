package codes;

import java.util.Scanner;

//Find Factorial of given number
public class PS6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for which we want to find the factorial : ");
        int a = in.nextInt();
        System.out.println("Factorial of given number : "+factorial(a));
    }

    static int factorial(int a)
    {
        int fact = 1;
        for(int i=a;i>0;i--)
        {
            fact = fact * i;
        }

        return fact;
    }

}
