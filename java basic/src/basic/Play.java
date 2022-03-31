import java.io.*;
import java.util.Arrays;

public class Play
{
    public static void main(String[] args)
    {
        int[] a1 = {1, 2, 3, 4};
        int n = 10;
        change(a1, n);
        System.out.println(Arrays.toString(a1) + " " + n);
    }

    static void change(int[] a, int n) {
        n = 100;
        a[0] = 100;
    }

}

