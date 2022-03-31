package School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine().trim());
            String[] tmpArr = bf.readLine().split("\\s+");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){ arr[i] = Integer.parseInt(tmpArr[i].trim()); }

            SumOfArray ob = new SumOfArray();
            int sum = ob.sumArray(arr, n);
            System.out.println(sum);
        }
    }

    int sumArray(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
