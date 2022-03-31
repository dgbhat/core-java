package Basic;

import java.util.regex.*;

public class RegEx {
    public static void main(String[] args) {
        String name = "1Geeksforgeeks";
        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern p = Pattern.compile(regex);
        if (name == null) {
            System.out.println(false);
        }
        Matcher m = p.matcher(name);
        System.out.println(m.matches());
    }
}
