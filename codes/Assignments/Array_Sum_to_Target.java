package codes.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Adder
{
    int len;
    int[] array;

    Adder(int n)
    {

        this.array = new int[n];
    }
    public void getData()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the elements in array : ");
        for(int i=0;i<this.array.length;i++)
        {
            this.array[i] = in.nextInt();
        }
    }

    public void Display()
    {
        for(int i=0;i<this.array.length;i++)
        {
            System.out.print(this.array[i]);
        }
        System.out.println();
    }

    public void Add(int target)
    {

        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = this.array.clone();
        for(int i=0;i<this.array.length;i++)
        {
            int a = this.array[i];
            int c = 0;
            arr[i] = -1;
            Arrays.sort(arr);
            int s = 1;
            int e = arr.length-1;
            while(s<=e)
            {
                int mid = s + (e-s)/2;
                if(arr[mid]+a==target)
                {
                    list.add(a);
                    list.add(arr[mid]);
                    c=1;
                    break;
                }
                else if(arr[mid]+a>target)
                {
                    e = mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
            if(c==1)
            {
                break;
            }

        }
        System.out.println(list);
    }

}
public class Array_Sum_to_Target {
    public static void main(String[] args) {
        Adder a1 = new Adder(8);
        a1.getData();
//        a1.Display();
        a1.Add(18);
    }
}
