package School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindElementFromArray {
    public static void main(String[] args) throws IOException {
        FindElementFromArray p = new FindElementFromArray();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringBuffer sb = new StringBuffer();
        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            int[] arr = new int[100];
            String[] strArr = bf.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }
            int x = Integer.parseInt(bf.readLine()); //bf.read();
            sb.append(p.search(arr, x)).append("\n");
        }
        System.out.println(sb);
    }

    int search(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele) return i;
        }
        return -1;
    }

/*
//OOP way

    int n, x;
    int[] arr = new int[100];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(bf.readLine());
        while (t > 0) {
            School.FindElementFromArray p = new School.FindElementFromArray();
            p.getInput(bf);
            sb.append(p.search(p.getArr(), p.getX())).append("\n");
            t--;
        }
        System.out.println(sb);
    }

    void getInput(BufferedReader bf) throws IOException {
        this.n = Integer.parseInt(bf.readLine());
        String[] strArr = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            this.arr[i] = Integer.parseInt(strArr[i]);
        }
        this.x = Integer.parseInt(bf.readLine());
    }

    int search(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) return i;
        }
        return -1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }*/
}



// https://www.geeksforgeeks.org/how-to-begin-with-competitive-programming/