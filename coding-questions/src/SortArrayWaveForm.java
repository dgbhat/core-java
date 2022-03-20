import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class SortArrayWaveForm {

    // A utility method to swap two numbers.
    void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....
    void sortInWave(int arr[], int n) {
        // Traverse all even elements
        for (int i = 0; i < n; i += 2) {
            // If current even element is smaller
            // than previous
            if (i > 0 && arr[i - 1] > arr[i])
                swap(arr, i - 1, i);

            // If current even element is smaller
            // than next
            if (i < n - 1 && arr[i] < arr[i + 1])
                swap(arr, i, i + 1);
        }
    }

    // Driver program to test above function
    public static void main(String args[]) {
        SortArrayWaveForm ob = new SortArrayWaveForm();
        int arr[] = {2, 1, 5, 3, 11, 7};
        int n = arr.length;
        ob.sortInWave(arr, n);
        System.out.println(Arrays.toString(arr));

        //testing with random input
        int a2[] = ob.randomArray();
        ob.sortInWave(a2, a2.length);
        System.out.println(Arrays.toString(a2));
    }

    int[] randomArray(){
        return IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();
    }
}



/*
* https://www.geeksforgeeks.org/sort-array-wave-form-2/
*
* Expected ->
* arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
*
* in -> [10, 5, 6, 3, 2, 20, 100, 80]
* op -> [10, 5, 6, 2, 20, 3, 100, 80]  OR [20, 5, 10, 2, 80, 6, 100, 3] etc
*
* Main Idea -> Every EVEN element has to be bigger than its adjecent
* */