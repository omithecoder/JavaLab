package codes;

//display even & odd from the array

import java.util.Arrays;

class NewArray
{
    int index=0;
    int[] arr = {};
    public void Add(int data)
    {
        this.arr[index]=data;
        this.index++;
    }

}


public class PS21 {
    public static void main(String[] args) {
        int[] arr = {12,34,6,7,99,56,34,2,66,47,90};
        NewArray even = new NewArray();
        NewArray odd = new NewArray();

        for(int i:arr)
        {
            if(i%2==0)
            {
                even.Add(i);
            }
            else
            {
                odd.Add(i);
            }
        }

        System.out.println("Even numbers in given Array : "+ Arrays.toString(even.arr));
        System.out.println("Odd numbers in given Array : "+ Arrays.toString(odd.arr));

    }
}
