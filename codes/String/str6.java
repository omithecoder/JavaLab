package codes.String;

import java.util.Scanner;

public class str6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String : ");
        int index =-1;
        StringBuilder input = new StringBuilder(in.next());
        System.out.println("Enter the character : ");
        char delchar = in.next().trim().charAt(0);
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==delchar)
            {
                index = i;
                break;
            }
        }
        if(index==-1)
        {
            System.out.println("The given character is not present in the string ");
        }
        else {
            input.deleteCharAt(index);
            System.out.println("The given character is deleted successfully");
            System.out.println(input);
        }



    }
}
