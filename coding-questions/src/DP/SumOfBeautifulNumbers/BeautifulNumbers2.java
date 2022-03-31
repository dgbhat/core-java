package DP.SumOfBeautifulNumbers;

import java.io.*;

public class BeautifulNumbers2 {
    public static void main(String[] args) throws IOException {
        //long timeStart = System.currentTimeMillis();
        long preProsArr[] = preprocess();
        //long timeend = System.currentTimeMillis();
        // System.out.println("Preprocess time: "+(timeend-timeStart));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int T = Integer.parseInt(br.readLine().trim());
        //Scan sc=new Scan();
        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
        Reader rs = new Reader();
        //int T=sc.scanInt();
        int T = rs.nextInt();
        assert (1 <= T && T <= 1000000);
        //long timeStartBeforeInput = System.currentTimeMillis();
        for (int t_i = 0; t_i < T; t_i++) {

            //String[] str = br.readLine().split(" ");
            int l = rs.nextInt();
            int r = rs.nextInt();
            //assert(l <= r);
            //assert(l != 0);
            //assert(r <= 1000000);
            //long out_ = solve(l, r,preProsArr);
            //long timeendAftereachInput = System.currentTimeMillis();
            //System.out.println("Each Input Result Total time: "+(timeendAftereachInput- timeStartBeforeInput));
            //System.out.println(preProsArr[r]-preProsArr[l-1]);
            output.write(preProsArr[r] - preProsArr[l - 1] + "\n");
        }
        //br.close();
        output.flush();
    }

    static boolean check(int u) {
        int cnt = 40;
        while (cnt > 0 && u != 4) {
            int ans = 0;
            while (u > 0) {
                ans += (u % 10) * (u % 10);
                u /= 10;
            }
            u = ans;
            cnt--;
            if (u == 1) return true;
        }
        return false;
    }

    static long[] preprocess() {
        long preProsArr[] = new long[1000005];
        for (int num = 1; num <= 1000000; num++) {
            if (check(num)) {
                preProsArr[num] = num;
            }
        }
        for (int num = 1; num <= 1000000; num++) {
            preProsArr[num] += preProsArr[num - 1];
        }
        return preProsArr;
    }


    /*public static int isHappyNumber(int num){
        int rem = 0, sum = 0;

        //Calculates the sum of squares of digits
        while(num > 0){
            rem = num%10;
            sum = sum + (rem*rem);
            num = num/10;
        }
        return sum;
    } */

    /*static long solve(int left, int right, long preProsArr[]){
       // Your code goes here
       long totalsum= preProsArr[right]-preProsArr[left-1];
       return totalsum;
    }*/
}

class Reader {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader() {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public Reader(String file_name) throws IOException {
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public String readLine() throws IOException {
        byte[] buf = new byte[64]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }

    public int nextInt() throws IOException {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }

    public long nextLong() throws IOException {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }

    public double nextDouble() throws IOException {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (c == '.') {
            while ((c = read()) >= '0' && c <= '9') {
                ret += (c - '0') / (div *= 10);
            }
        }
        if (neg)
            return -ret;
        return ret;
    }

    private void fillBuffer() throws IOException {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }

    private byte read() throws IOException {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }

    public void close() throws IOException {
        if (din == null)
            return;
        din.close();
    }
}