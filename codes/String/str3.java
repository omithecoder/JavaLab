package codes.String;

import java.util.Arrays;
import java.util.Scanner;

public class str3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        char M = 'z';
        char m = 'a';

        int freq[] = new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<input.length();i++)
        {
            freq[input.charAt(i)-'a']=freq[input.charAt(i)-'a']+1;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            {
                System.out.println((char)('a'+i) + " = "+freq[i]);
                if(freq[i]>Max)
                {
                    Max = freq[i];
                    M = (char)(i+'a');
                }
                if(freq[i]<Min)
                {
                    Min = freq[i];
                    m = (char)(i+'a');
                }
            }
        }


        System.out.println("Maximum Character repeats : "+M);
        System.out.println("Minimum Character repeats : "+m);

    }
}
