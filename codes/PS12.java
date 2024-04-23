package codes;

import java.util.Scanner;

// Write a program to create & display 1D Array & 2D Array
public class PS12 {
    public static void main(String[] args) {
        //--------------------------1D array-----------------------------------------------------------------
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the number in Array : ");
//        Input in array
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.print("Array : ");
//        Display Array
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }

}