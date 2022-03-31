package Basic;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int n = arr.length;
        int d = 2;
        rotate(arr, n, d);
    }

    static void rotate(int[] arr, int n, int d) {
        //By taking a new array
        int[] newArr = new int[n];
        int index = 0;
        for (int i = d; i < n; i++) {
            newArr[index++] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            newArr[index++] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
