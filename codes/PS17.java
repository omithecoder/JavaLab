package codes;

//Find Smallest And Largest from the given array
public class PS17 {
    public static void main(String[] args) {
        int[] arr = {12,4,2,44,15,323,56,-901};
        System.out.println("Smallest Number in the array : "+smallestInArr(arr));
        System.out.println("Largest Number in the array : "+largestInArr(arr));

    }

    static int smallestInArr(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }

        return min;
    }

    static int largestInArr(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
