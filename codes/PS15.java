package codes;

import java.util.Arrays;
import java.util.Scanner;

// Write program for array take input from the user and display the content 1D array & 2D array (using forloop foreach_Loop & toString() )
class OneD
{
    int[] array = new int[5];
    public void DisplayArr(int len)
    {
//        Using For-Loop
        for(int i=0;i<len;i++)
        {
            System.out.print(this.array[i]+" ");
        }
    }
}

class MulD
{
    int[][] Matrix = new int[3][3];

    public void DisplayMat()
    {
//        Using ForEach Loop
        for(int[] rowarr : this.Matrix)
        {
//            Using Arrays.toString();
            System.out.print(Arrays.toString(rowarr));
            System.out.println();
        }
    }
}
public class PS15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        OneD a1 = new OneD();
        System.out.println("Enter the 5 elements : ");
        for(int i=0;i<5;i++)
        {
            a1.array[i] = in.nextInt();
        }
        System.out.println("Displaying 1D array");
        a1.DisplayArr(5);
        System.out.println();
        System.out.println("Array : "+ Arrays.toString(a1.array));

        MulD a2 = new MulD();
        System.out.println("Fill the 3X3 matrix : ");
        for(int row = 0;row<3;row++)
        {
            System.out.println("Enter the values in the "+(row+1)+" row");
            for(int col=0;col<3;col++)
            {
                a2.Matrix[row][col] = in.nextInt();
            }
        }

        System.out.println("Displaying the Matrix ");
        a2.DisplayMat();





    }
}
