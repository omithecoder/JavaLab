package codes;

import java.util.Arrays;
import java.util.Scanner;

// Java Program to Add 2D array
class MulDimensional {
    int[][] Matrix = new int[3][3];
}

public class PS18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MulDimensional mat1 = new MulDimensional();
        MulDimensional mat2 = new MulDimensional();

        System.out.println("Enter the numbers in first Matrix : ");
        for(int row=0;row<mat1.Matrix.length;row++)
        {
            System.out.println("Enter the element in "+(row+1)+" row");
            for(int col=0;col<mat1.Matrix[row].length;col++)
            {
                mat1.Matrix[row][col]=in.nextInt();
            }
        }

        System.out.println("Enter the numbers in second Matrix : ");
        for(int row=0;row<mat2.Matrix.length;row++)
        {
            System.out.println("Enter the element in "+(row+1)+" row");
            for(int col=0;col<mat2.Matrix[row].length;col++)
            {
                mat2.Matrix[row][col]=in.nextInt();
            }
        }

        System.out.println("The Addition of two matrix : ");
        displayMat(AddMat(mat1.Matrix,mat2.Matrix));



    }

    static int[][] AddMat(int[][] a,int[][] b)
    {
        for(int row=0;row<a.length;row++)
        {

            for(int col=0;col<a[row].length;col++)
            {
                a[row][col]=a[row][col]+b[row][col];
            }
        }

        return a;
    }

    static void displayMat(int[][] a)
    {
        for(int[] rowarr : a)
        {
//            Using Arrays.toString();
            System.out.print(Arrays.toString(rowarr));
            System.out.println();
        }
    }
}
