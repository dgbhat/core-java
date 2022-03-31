package School;

import java.io.IOException;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        ReverseArray ra = new ReverseArray();
        int[] arr = {3, 6, 3, 1, 4};
        int n = arr.length;
        ra.reverseArray(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start]; //swap
            arr[start] = arr[end];
            arr[end] = temp;
//            reverseArray(arr, ++start, --end); //recursion OR
            start++; end--; //without recursion
        }
    }
}
