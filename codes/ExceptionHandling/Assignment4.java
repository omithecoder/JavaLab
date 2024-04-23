package codes.ExceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Choose the Following Scenario for Exception handling : ");
            System.out.println("1) Divide By Zero \n2) Array index out of bound \n3) Null pointer\n4) Exit");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter the numbers to perform division (a/b) : ");
                    System.out.println("Enter a : ");
                    int a = sc.nextInt();
                    System.out.println("Enter b : ");
                    int b = sc.nextInt();
                    try {
                        int c = a / b;
                        System.out.println("Division : " + c);
                    } catch (ArithmeticException e) {
                        System.out.println("You shouldn’t divide a number by zero.");
                    }
                    break;
                case 2:
                    int[] number = {1, 2, 3, 4, 5, 6};
                    System.out.println(Arrays.toString(number));
                    System.out.println("Enter the index of which number you wants to access : ");
                    int ind = sc.nextInt();

                    try {
                        int num = number[ind];
                        System.out.println("Number at index " + ind + " = " + num);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("OOPs!!!Array Index " + ind + " out of bounds for length " + number.length);
                    }
                    break;
                case 3:
                    String name = null;
                    System.out.println("Length of the String : ");
                    try {
                        System.out.println(name.length());
                    } catch (NullPointerException e) {
                        System.out.println("Null Pointer Exception arises!!");
                    }
                    break;
                case 4:
                    System.out.println("Exit the program!!");
                    loop=false;
                    break;
                default:
                    System.out.println("Invalide Input!!");
            }
        }
    }
}
