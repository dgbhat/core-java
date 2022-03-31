package Basic;

public class StockBuySell {
    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        int n = arr.length;
        getMaxProfit(arr, n);
    }

    static void getMaxProfit(int[] arr, int n) {
        int maxProf = 0, invested = 0;
        boolean bought = false;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || (arr[i] > arr[i + 1])) {
                //sell
                if (bought) {
                    bought = false;
                    maxProf = maxProf + arr[i] - invested;
                }
            } else {
                //buy/hold
                if (!bought) {
                    bought = true;
                    invested = arr[i];
                }
            }
        }
        System.out.println(maxProf);
    }

}


// https://www.geeksforgeeks.org/stock-buy-sell/