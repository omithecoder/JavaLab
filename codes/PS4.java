package codes;

//    write a java program to display ASCII value of given Character

import java.util.Scanner;

class ASCII_finder
{
    char Character;
    public int FindAscii(char C)
    {
        return (int)C;
    }
}
public class PS4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ASCII_finder C = new ASCII_finder();
        System.out.print("Enter the Character : ");
        C.Character = in.next().trim().charAt(0);
        System.out.println(C.FindAscii(C.Character));

        in.close(); //Close Scanner
    }
}
