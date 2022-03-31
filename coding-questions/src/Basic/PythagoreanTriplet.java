package Basic;

import java.util.Arrays;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int[] arr = {3, 10, 5, 6, 4, 9};
        int n = arr.length;
        boolean found = findTriplet(arr, n);
        System.out.println(found);
    }

    static boolean findTriplet(int[] arr, int n) {
        Arrays.sort(arr);
        int a, b, c;
        for (int i = n - 1; i > 1; i--) {
            c = i;
            a = 0;
            b = i - 1;
            while (a < b) {
                int aSq = (int) Math.pow(arr[a], 2);
                int bSq = (int) Math.pow(arr[b], 2);
                int cSq = (int) Math.pow(arr[c], 2);

                if (aSq + bSq == cSq) {
                    return true;
                } else if (aSq + bSq < cSq) {
                    a++;
                } else if (aSq + bSq > cSq) {
                    b--;
                }
            }
        }
        return false;
    }
}


// https://practice.geeksforgeeks.org/problems/pythagorean-triplet3018/1