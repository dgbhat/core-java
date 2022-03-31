package Basic;

public class PowerOfTwo {
    public static void main(String[] args)
    {
        int n = 8;
        boolean isPowOf2 = isPowOfTwo(n);
        System.out.println(isPowOf2);

        boolean v2 = isPowOfTwoV2(n);
        System.out.println(v2);
    }

    static boolean isPowOfTwo(int n) {
        int i = 0;
        long pow = 0;
        while (pow <= n) {
            pow = (long) Math.pow(2, i);
            if(n == pow) return true;
            i++;
        }
        return false;
    }

    static boolean isPowOfTwoV2(long n) {
        if (n != 0 && (n & n-1) == 0) {
            return true;
        }
        return false;
    }
}


//https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1#