package codes;

// Java program to find second largest in the array
public class PS19 {
    public static void main(String[] args) {
        int[] arr = {1,2};
//      If all elements in the given array are same means no second largest element then it returns Min value of Integer as Second Largest element
        System.out.println("Second Largest Element from the given array : "+SecondLargest(arr));
    }

    static int SecondLargest(int[] arr) {
        int max1=Integer.MIN_VALUE;
        int max2 = max1;
        for(int i:arr)
        {
            if(i>max1)
            {
                max2=max1;
                max1=i;
            }
        }

        return max2;
    }
}
