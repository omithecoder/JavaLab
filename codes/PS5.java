package codes;

import java.util.Scanner;

// p tSwahe numbers with or without using 3rd variable

class SwapNum
{
    int a;
    int b;

    public void SwapWith3rdVar()
    {
        int temp = this.a;
        this.a = this.b;
        this.b = temp;
    }

    public void SwapWithout3rdVar()
    {
        this.a = this.a * this.b;
        this.b = this.a / this.b;
        this.a = this.a / this.b;
    }


}

public class PS5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SwapNum sw = new SwapNum();
        System.out.println("Enter the number to swap : ");
        System.out.print("a : ");
        sw.a = in.nextInt();
        System.out.print("b : ");
        sw.b = in.nextInt();

        sw.SwapWith3rdVar();

        System.out.println("a : "+ sw.a);
        System.out.println("b : "+ sw.b);

        sw.SwapWithout3rdVar();

        System.out.println("a : "+ sw.a);
        System.out.println("b : "+ sw.b);



    }


}
