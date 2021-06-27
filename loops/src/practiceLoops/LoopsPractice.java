package practiceLoops;

public class LoopsPractice {
    public static void main(String[] args) {
        String givenString = "The South African category:furniture Defence category:makeup Force comprised The South African Defence category:apparel Force comprised";
        printCategory(givenString);
    }

    public static void printCategory(String str) {
        String categoryString = "category:";
        int start = 0;
        while (true) {
            start = str.indexOf(categoryString, start);
            if (start == -1) {
                break;
            }
            System.out.println(str.substring(start + categoryString.length(), str.indexOf(" ", start + categoryString.length())));
            start++;
        }
    }
}
