package Basic;

public class MajorityNumber {
    // Function to find majority element
    public static int findMajority(int[] arr) {
        int count = 0, candidate = -1;

        // Finding majority candidate
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
                count++;
            } else {
                if (candidate == arr[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        //by now we already have the element with max occurances = candidate

        // Checking if majority candidate occurs more than n/2 times
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (candidate == arr[i]) {
                count++;
            }
            if (count > arr.length / 2) {
                return candidate;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 3, 2, 3};
        int majority = findMajority(arr);
        System.out.println(" The majority element is : " + majority);
    }
}


//https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1


/*
MajorityEle(arr, n)
	count=0
	candidate
	for i=0; i<n; i++;
		if count==0
			count=1
			candidate=arr[i]
		else
			if candidate==arr[i]
				count++
			else
				count--

*/