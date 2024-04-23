package codes;

import java.util.Scanner;

//Print all Prime number till the given number

public class PS8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = in.nextInt();
        PrintPrime(a);
    }

    static void PrintPrime(int a) {
        if(a>1) {
            int c=0;
            for (int i = 2; i <= a; i++) {
                if(i==2)
                {
                    System.out.print(2+" ");
                }
                else {
                    if(!PrimeOrNot(i))
                    {
                        System.out.print(i+" ");
                    }
                }
            }
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
