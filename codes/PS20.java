package codes;

// program to find duplicate

public class PS20 {
    public static void main(String[] args) {


        int[] arr = {12, 34, 52, 12, 45, 12};
        int[] freqOfElement = new int[1000];
        for (int i : arr) {
            freqOfElement[i]++;
        }
        for(int j =0;j<arr.length;j++)
        {
            if(freqOfElement[arr[j]]>1)
            {
                System.out.println(arr[j]+"is repeated");
                break;
            }
        }
    }
}
