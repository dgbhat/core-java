import java.io.*;

import java.util.*;

public class BeautifulNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter wr = new PrintWriter(System.out);

        int T = Integer.parseInt(br.readLine().trim());

        pre();

        for (int t_i = 0; t_i < T; t_i++) {

            String[] str = br.readLine().split(" ");

            int l = Integer.parseInt(str[0]);

            int r = Integer.parseInt(str[1]);

            long out_ = solve(l, r);

// System.out.println(out_);

            wr.write(out_ + "\n");

        }

        wr.close();

        br.close();

    }

    private static int[] memo = new int[1000001];

    private static long[] sums = new long[1000001];


    static void pre() {

        Arrays.fill(memo, -1);

// Arrays.fill(sums, 0);

        memo[0] = 0;

        memo[1] = 1;

        memo[2] = 0;

        memo[4] = 0;

        memo[16] = 0;

        memo[37] = 0;

        memo[58] = 0;

        memo[89] = 0;

        memo[145] = 0;

        memo[42] = 0;

        memo[20] = 0;


        sums[0] = 0;

        sums[1] = 1;

        sums[2] = 1;


        for (int i = 3; i < 1000001; i++) {

// boolean result = ;

            if (isBeautiful(i)) {

                memo[i] = 1;

                sums[i] = sums[i - 1] + i;

            } else {

                memo[i] = 0;

                sums[i] = sums[i - 1];

            }

        }

    }


    static long solve(int l, int r) {

        return sums[r] - sums[l - 1];

    }


    private static boolean isBeautiful(int i) {


        if (memo[i] != -1) {

            return memo[i] == 1;

        }


// int n = helper(i);

// System.out.println(" -- " + i + " " + n);

        if (isBeautiful(helper(i)))

            memo[i] = 1;

        else

            memo[i] = 0;

        return memo[i] == 1;

    }


    private static int helper(int n) {

        int totalSum = 0;

        while (n > 0) {

            int d = n % 10;

// totalSum += (n % 10) * (n % 10);

            totalSum += d * d;

            n = n / 10;

        }

        return totalSum;

    }


}