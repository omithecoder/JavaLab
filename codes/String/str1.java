package codes.String;

import java.util.Scanner;

import static java.util.Collections.swap;

public class str1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string : ");
        StringBuilder input = new StringBuilder(in.next());
        System.out.println(StrRev(input));

    }

    private static String StrRev(StringBuilder input) {
        int len = input.length()-1;
        for(int i=0;i<input.length()/2;i++)
        {
            char temp = input.charAt(i);
            input.setCharAt(i, input.charAt(len-i));
            input.setCharAt(len-i,temp);
        }

        return input.toString();
    }



}
