/*
* https://www.hackerearth.com/problem/algorithm/beautiful-numbers-05de0f51-101121ca/
*/


package SumOfBeautifulNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BeautifulNumbersMyOwn {
    static Map<Integer, Integer> findings = new HashMap();
    static Map<Integer, Integer> tmpFindings = new HashMap();

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {

            String[] str = br.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);

            long out_ = solve(l, r);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }

    static long solve(int l, int r) {
        // Your code goes here
        long sumOfBN = 0;
        for (int num = l; num <= r; num++) {
            if (isBeautifulNumber(num)) {
                sumOfBN += num;
//                System.out.println("YES "+ num);
            }
            else{
//                System.out.println("NO "+ num);
            }
        }
//        System.out.println("SUM "+ sumOfBN);
        return sumOfBN;
    }

    static boolean isBeautifulNumber(int num) {
//        System.out.println("num "+num);
//        System.out.println(findings);
//        System.out.println(tmpFindings);
//        System.out.println();

        if ((num == 1) || ((findings.get(num) != null) && (findings.get(num) == 1))) {
            tmpFindings.replaceAll((k, v) -> v = 1);
            findings.putAll(tmpFindings);
            tmpFindings.clear();
            return true;
        } else if ((findings.get(num) != null && 2 == findings.get(num)) || (tmpFindings.get(num) != null && num == tmpFindings.get(num))) {
            findings.putAll(tmpFindings);
            tmpFindings.clear();
            return false;
        } else {
            int digit = 0, squaredSum = 0;
            while (num > 0) {
                digit = (num % 10);
                num = num / 10;
                squaredSum = digit * digit + squaredSum;
            }
            tmpFindings.put(squaredSum, 2); //Do not know if a BeautifulNumber yet
            return isBeautifulNumber(squaredSum);
        }
    }
}
