package codes;

import java.util.Scanner;


//    Write Java Program To check whether given number is odd or even


class CheckOddOrEven
{
    int a;
    public boolean OddOrEven(int a)
    {
        if(a%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}


public class PS1 {
public static void main(String[] args) {
    Scanner in =  new Scanner(System.in);
    CheckOddOrEven csk = new CheckOddOrEven();
    System.out.println("Enter the number which you want to check : ");
    csk.a = in.nextInt();
    if(csk.OddOrEven(csk.a))
    {
        System.out.println("The number "+csk.a+" is Even!");
    }
    else
    {
        System.out.println("The number is Odd!");
    }

    in.close(); // Scanner Close

}


}
