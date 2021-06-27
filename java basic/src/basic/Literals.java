package basic;
/*
Regardless of its complexity, a program always performs operations on numbers, strings, and other values. These values are called literals

Ex: integer numbers, strings, characters, strings

we can add underscores to divide the digit into blocks for increased readability

To write a character we use single quotes as follows. 'text', '1000' are invalid literals

To write a string we use double quotes instead of single ones. 'A' is a character, "A" is a string;

Whitespace – all characters that are not visible (space, tab, newline, etc.)
*/

public class Literals {
    public static void main(String[] args) {
        int a = 100_000;
        System.out.println(a-40_000);
    }
}
