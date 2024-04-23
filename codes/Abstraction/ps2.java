package codes.Abstraction;

//2)Interface A having a method findSqr(int n).Class B will implement A and method will return square of the number. Take input from user

import java.util.Scanner;

interface A
{
    int num = 0;
    int findSqr();
}

class B implements A
{
    int num;
    B(int n)
    {
        this.num = n;
    }

    @Override
    public int findSqr() {
        return this.num*this.num;
    }
}

public class ps2 {
    public static void main(String[] args) {
        System.out.println("Enter the number for which we want to find Square : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        B b = new B(num);
        System.out.println("The Square of given number : "+b.findSqr());

    }
}
