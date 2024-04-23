package codes.String;

import java.util.Scanner;

public class str4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = in.nextLine();
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println("The number of words : "+(count+1));

    }
}
