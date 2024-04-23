package codes.String;

import java.util.Scanner;

public class str5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = in.next();
        int freq[] = new int[26];
        for(int i=0;i<input.length();i++)
        {
            freq[input.charAt(i)-'a']=freq[input.charAt(i)-'a']+1;
        }
        System.out.println("Dulicate Letters");
        for(int i=0;i<26;i++)
        {
            if(freq[i]>1)
            {
                System.out.println((char)(i+'a'));
            }
        }
    }
}
