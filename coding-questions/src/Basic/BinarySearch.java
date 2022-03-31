package Basic;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 10, 1, 6, 4, 9};
        int x = 10;
        int n = arr.length;
        Arrays.sort(arr);
        boolean found = binarySearch(arr, n, x);
        System.out.println(found);
    }

    static boolean binarySearch(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == arr[mid]) {
                return true;
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            }
        }
        return false;
    }
}
