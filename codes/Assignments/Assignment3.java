package codes.Assignments;


import java.util.Scanner;

class Shapes
{

    public int Area(int h,int b)
    {
        return (h*b)/2;
    }

    public int Area(int s)
    {
        return s*s;
    }

    public double Area(double pi,int r)
    {
        return pi*r*r;
    }

}

class Triangle extends Shapes
{
    int h;
    int b;

    public void getInputs()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the triangle : ");
        this.h = in.nextInt();
        System.out.print("Enter the base of the triangle : ");
        this.b = in.nextInt();
        System.out.println();
    }

}

class Square extends Shapes
{
    int s;
    public void getInputs()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Side of the square : ");
        this.s = in.nextInt();
        System.out.println();
    }

}

class Circle extends Shapes
{
    double pi;
    int radius;
    public void getInputs()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        this.radius = in.nextInt();
        System.out.print("Enter the value of Pi : ");
        this.pi = in.nextDouble();
        System.out.println();
    }

}

public class Assignment3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Square s1 = new Square();
        Circle c1 = new Circle();
        t1.getInputs();
        s1.getInputs();
        c1.getInputs();

        System.out.println("Area of Triangle " + t1.Area(t1.h,t1.b) + " SqUnit");
        System.out.println("Area of Square " + s1.Area(s1.s) + " SqUnit");
        System.out.println("Area of Circle " + c1.Area(c1.pi,c1.radius) + " SqUnit");


    }

}


