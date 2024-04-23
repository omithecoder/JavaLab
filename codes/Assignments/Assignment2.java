package codes.Assignments;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Adder1
{
    int[] arr;
    public Adder1(int s)
    {
        arr = new int[s];
    }


    public void getdata()
    {
        System.out.println("Enter the elements in array : ");
        Scanner in = new Scanner(System.in);
        for(int i=0;i<this.arr.length;i++)
        {
            this.arr[i] = in.nextInt();
        }
    }

    public void display()
    {
        for(int i : this.arr)
        {
            System.out.println(i);
        }
    }

    public int[] add(int target)
    {

        int [] ans = new int[2];
        for(int i=0;i<this.arr.length-1;i++)
        {
            for(int j=i+1;j<this.arr.length;j++)
            {
                if(this.arr[i]+this.arr[j]==target)
                {
                    ans[0] = this.arr[i];
                    ans[1] = this.arr[j];
                    return ans;
                }
            }

        }
        ans = new int[0];
        return ans;
    }



}
public class Assignment2 {
    public static void main(String[] args) {
        Adder1 arr1 = new Adder1(8);
        arr1.getdata();
//        arr1.display();
        System.out.println(Arrays.toString(arr1.add(18)));

    }


}
