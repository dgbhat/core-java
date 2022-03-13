package MaxNumberOfTasks;//https://leetcode.com/discuss/interview-question/1194238/paypal-max-tasks-that-can-be-completed-in-given-budget
//https://leetcode.com/discuss/interview-question/1784166/Max-Budget-oror-Task-Completion-oror

/*
input ->
5 50
1 5
3 2
7 30
10 5
12 4

op ->
Max Tasks: 4
*/



import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class MaxNumberOfTasks {

    static void Sort2DArrayBasedOnSum(int[][] array) {
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
                /*
                if i of next pair is < i of curr then swap curr with next
                || ((first[0] + first[1] == second[0] + second[1]) && (first[0] > second[0]))
                */
                if (first[0] + first[1] > second[0] + second[1] || ((first[0] + first[1] == second[0] + second[1]) && (first[0] > second[0]))) return 1;
                else return -1;
            }
        });
    }

    static int solve(int n, int t, int[][] task) {
        //1 sort the arr based on sum
        //      if i of next pair is < i of curr then swap curr with next
        //2 start summing on new arr
        //      counter++
        //      stop if accSum > t
        //      return counter

        int accSum = 0, counter = 0, prevPoint = 0, timeTaken = 0;
        Sort2DArrayBasedOnSum(task); //sort array based on sum
        System.out.println(Arrays.deepToString(task));
        for (int i = 0; i < n; i++) {
            accSum += Math.abs(task[i][0] - prevPoint) + task[i][1];
            if (accSum + task[i][0] <= t) {
                timeTaken = accSum + task[i][0];
                counter++;
            } else {
                break;
            }
            prevPoint = task[i][0];
        }
        System.out.println("timeTaken: "+timeTaken);
        return counter;
    }

    public static void main(String[] args) throws IOException {
        //reading input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int t = Integer.parseInt(line[1]);
        int[][] task = new int[n][2];
        for (int i_task = 0; i_task < n; i_task++) {
            String[] arr_task = br.readLine().split(" ");
            for (int j_task = 0; j_task < arr_task.length; j_task++) {
                task[i_task][j_task] = Integer.parseInt(arr_task[j_task]);
            }
        }
        wr.close();
        br.close();
        //reading complete
        //get solution
        int maxTasks = solve(n, t, task);
        System.out.println("Max Tasks: " + maxTasks);
    }
}
