package codes;

import java.util.Arrays;

public class Swap {
    int a;
    int b;
    public void swap()
    {
        int temp = this.a;
        this.a = this.b;
        this.b = temp;
    }

    public static void main(String[] args) {
        Swap s = new Swap();
        s.a = 10;
        s.b = 20;
        System.out.println(s.a);
        System.out.println(s.b);
        s.swap();
        System.out.println(s.a);
        System.out.println(s.b);

    }

}

