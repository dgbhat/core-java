package Basic;

import java.util.Arrays;

public class MinDifferenceTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {-1, 5, 10, 20, 28, 3};
        int[] arr2 = {26, 134, 135, 15, 17};
        int n1 = arr1.length;
        int n2 = arr2.length;
        findMinDiff(arr1, arr2, n1, n2);
    }

    static void findMinDiff(int[] arr1, int[] arr2, int n1, int n2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int min = Integer.MAX_VALUE;
        int i = 0, j = 0;
        int first = 0, second = 0;
        while (i < n1 && j < n2) {
            if (Math.abs(arr1[i] - arr2[j]) < min) {
                min = Math.abs(arr1[i] - arr2[j]);
                first = arr1[i];
                second = arr2[j];
            }
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(min);
        System.out.println(first + " " + second);
    }
}



/*
input [-1,5,10,20,28,3] [26,134,135,15,17]
ans : [26,28]
* */


//