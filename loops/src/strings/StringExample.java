package strings;

public class StringExample {
    public static void main(String[] args) {
        String str = "ABCDEFG";

        String str1 = str.substring(2);
        System.out.println(str1);

        /**
         * substring(startIndex, EndIndex); => EndIndex is non-inclusive
         * */
        String str2 = str.substring(1, 2);
        System.out.println(str2);

        System.out.println(str == "ABCDEF");
        System.out.println(str.equals("ABCDEFG"));
        System.out.println(str.equalsIgnoreCase("abcdefg"));
        System.out.println(str.charAt(2));

        String str3 = "ABCDEFGHEF";
        System.out.println(str3.indexOf('A'));
        System.out.println(str3.indexOf('E', 2));
        System.out.println(str3.indexOf("EF"));
        System.out.println(str3.indexOf("EF", 6));
        System.out.println(str3.lastIndexOf("EF"));
    }
}
