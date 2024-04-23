package codes;

import java.util.Scanner;

//write code to implement 2D array

public class PS13 {
    public static void main(String[] args) {
        //        -------------------------------------2D array-----------------------------------------------------
        Scanner in = new Scanner(System.in);
        int[][] mat = new int[3][3];

        System.out.println("Enter the elements into the Matrix : ");
        for(int row =0 ;row< mat.length;row++)
        {
            System.out.print("Enter the elements in row "+row+" : ");
            for(int col = 0;col<mat[row].length;col++)
            {
                mat[row][col] = in.nextInt();
            }

        }

//        Display
        System.out.println("Matrix : ");
        for(int row = 0;row <mat.length;row++)
        {
            for(int col=0;col<mat[row].length;col++)
            {
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }

    }
}
