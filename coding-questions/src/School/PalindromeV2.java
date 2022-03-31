package School;

public class PalindromeV2 {
    public static void main(String[] args) {
        String s = "1411";
        PalindromeV2 ob = new PalindromeV2();
        System.out.println(ob.isPalindrome(s));
    }

    boolean isPalindrome(String s) {
        if (s.equals(new StringBuffer(s).reverse().toString())) {
            return true;
        }
        return false;
    }
}
