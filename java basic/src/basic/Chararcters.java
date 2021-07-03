package basic;

public class Chararcters {

    /*
     A character can be also created using its hexadecimal code in the Unicode table. The code starts with <escape>\\u
     minimum value encoded as '\u0000' and the maximum value encoded as '\uffff'.
     Any char variable may be considered as an unsigned integer value in the range from 0 to 65535.
    */


    static void charRepresentation() {
        char char1 = '@';

        /*0040 = '@' in unicode. ie, utf-16*/
        char char2 = '\u0040';
        System.out.println('\u0040');

        /* 64 = '@' in ASCII, The number 64 just corresponds to the Unicode hexadecimal code '\u0040' */
        char char3 = 64;    //'@'

        /*doesnt print '@@@'; prints 192 which is 64+64+64*/
        System.out.println(char1 + char2 + char3);

        /*new line character*/
        char nl = 10;
        System.out.println("HEY");
        System.out.print(nl);
        System.out.println("HEY");

        // char ch = '';  ERROR java: empty character literal

        /*
        Carraige return character, \r
        It moves the cursor back to beginning of the line
        */
        System.out.print("ABCDEF");
        System.out.print('\r');
        System.out.print("1234"); //"1234" is overwriting "ABCD.."
        System.out.println();

    }


    static void charOperation() {
        /*
        Adding (+) and subtracting (-) integer numbers in order to get the next and previous character according to the Unicode order
        */
        char ch = 'a';
        ch += 1;    // 'c'
        ch -= 2;    // 'a'
        // ch = ch -2; Error

        /*
        Adding and subtracting one character to and from another one.
        Use the ASCII values of chars for calculations
        */
        char cha = 'b';             // 98
        cha += 'a';                 // 98+97=195
        System.out.println(cha);    // 'Ã'
        cha -= 'b';                 // 195-98=97
        System.out.println(cha);    // 'a'

        /* prefix and postfix */
        char chb = 'A';
        chb += 10;
        System.out.println(chb);   // 'K'
        System.out.println(++chb); // 'L'
        System.out.println(++chb); // 'M'
        System.out.println(--chb); // 'L'
    }


    public static void main(String[] args) {
        charRepresentation();
        charOperation();

    }
}




/*
ASCII table
A-Z     : 65-90
a-z     : 97-122
0-9     : 48-57
<space> : 32
new line: 10
*/