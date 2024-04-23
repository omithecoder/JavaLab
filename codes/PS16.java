package codes;

import java.util.Arrays;

// Java Program To add two 1D arrays
public class PS16 {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5};
        int[] arr2 ={5,-4,3,2,8,90};
        System.out.println("Sum of two arrays : "+ Arrays.toString(AddArray(arr1,arr2)));
    }

    static int[] AddArray(int[] arr1, int[] arr2) {
        if(arr1.length!=arr2.length)
        {
//            if length of both arrays are not equal then return array with all values as -1
            Arrays.fill(arr1,-1);
            return arr1;
        }
        else
        {
            for(int i=0;i<arr1.length;i++)
            {
                arr1[i] = arr1[i] + arr2[i];
            }
        }

        return arr1;
    }
}
