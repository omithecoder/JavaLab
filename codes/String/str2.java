package codes.String;

import java.util.Scanner;

public class str2 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = in.next();
        System.out.println(checkPallindrome(input));

    }

    private static boolean checkPallindrome(String input) {
        int left = 0;
        int right = input.length()-1;
        while(left<right)
        {
            if(input.charAt(left)!=input.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
