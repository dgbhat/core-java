package School;

public class ArmstrongNumber {

    public static void main(String[] args) {
        boolean checked = isArmstrongNum(153);
        System.out.println(checked);
    }

    static boolean isArmstrongNum(int n) {
        int s=0, bkp=n;
        while(n>0){
            int digit = n % 10;  n /= 10;
            s += Math.pow(digit, 3);
        }
        if(s==bkp) return true;
        return false;
    }


    void v2() {
        int n = 153;
        double sumOfCubes = Math.pow(n%10,3) + Math.pow((n/10)%10,3) + Math.pow((n/100)%10,3);
        if(n ==sumOfCubes) System.out.println("YES");
    }
}
