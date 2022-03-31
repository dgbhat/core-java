package School;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {
    public static  void Sort2DArrayBasedOnSum (int[][] array){
        Arrays.sort(array, (int[] first, int[] second) -> {
            if(first[0] + first[1] > second[0]+second[1]) return 1;
            else return -1;
        });
    }


    public static void main(String[] args) {
        int[][] task = {{1 ,5},{3 ,2},{7 ,30},{10 ,5},{12 ,4}};
        Sort2DArrayBasedOnSum(task);
        System.out.println(Arrays.deepToString(task));
    }
}
