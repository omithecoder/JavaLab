package codes;


import java.util.Scanner;

// find the given number is prime or not
public class PS7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        if(PrimeOrNot(num))
        {
            System.out.println("The given Number is Not Prime!");
        }
        else
        {
            System.out.println("The Given Number is Prime");
        }

    }

    static boolean PrimeOrNot(int a)
    {
        for(int i = 2;i<=(int)Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                return true;
            }
        }
        return false;
    }
}
