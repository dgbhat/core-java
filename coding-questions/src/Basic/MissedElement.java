package Basic;

public class MissedElement {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int n = arr.length + 1;
        solve(arr, n);
    }

    static void solve(int[] arr, int n) {
        int missed = -1;
        int sumActual = 0, sumArr = 0;
        for (int i = 0; i < n; i++) {
            if (arr.length > i) sumArr += arr[i];
            sumActual += i + 1;
        }
        missed = sumActual - sumArr;
        System.out.println(missed);
    }

    static void solveV2(int[] arr, int n) {
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        System.out.println(sum); //missed element
    }
}


/*
* https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1
*
Input:
N = 5
A[] = {1,2,3,5}
Output: 4
* */