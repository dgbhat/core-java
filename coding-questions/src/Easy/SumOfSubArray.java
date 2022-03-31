package Easy;

public class SumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int x = 12;
        findSumOfSubarray(arr, n, x);
    }

    static void findSumOfSubarray(int[] arr, int n, int x) {
        //SLIDING WINDOW
        int low = 0, high = 0, sum = 0;
        while (high < n && low < n) {
            if (x == sum) {
                System.out.println(low+1 + " " + high); //low+1 as 1based index is asked
                return;
            } else if (x > sum) {
                sum = sum + arr[high];
                high++;
            } else if (x < sum) {
                sum = sum - arr[low];
                low++;
            }
        }
        System.out.println("-1");
    }
}

// OP -> // 2 4
//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1


/*
sumOfSubArray2(arr, n, x)
	low=0
	high=0
	sum=0
	while low<n && high<n
		if sum == x
			return low,high
		if sum < x
			sum += arr[high]
			high++
		if sum > x
			sum -= arr[low]
			low++
	return -1
*/