package School;

public class Palindrome {
    public static void main(String[] args) {
        String s = "141";
        Palindrome ob = new Palindrome();
        System.out.println(ob.isPalindrome(s));
    }

    boolean isPalindrome(String s) {
        int start = 0, end = s.length()-1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++; end--;
        }
        return true;
    }
}
