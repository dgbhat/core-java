package School;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        ReverseArray ra = new ReverseArray();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine().trim());
            String[] tmpArr = bf.readLine().trim().split("\\s+");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println(i + "" + arr.length);
                arr[i] = Integer.parseInt(tmpArr[i]);
            }

            ra.reverseArray(arr, 0, n - 1);
            System.out.println(Arrays.toString(arr));
        }
    }

    void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start]; //swap
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, ++start, --end); //recursion
        }
    }
}
