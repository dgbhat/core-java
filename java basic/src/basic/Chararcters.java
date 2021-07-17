package basic;

public class Chararcters {
    /*CHARACTER REPRESENTATION*/

    static void Q1() {
        char char2 = '\u0040';
        System.out.println(char2);
        // '@'
    }

    static void Q2() {
        char char3 = 64;
        System.out.println(char3);
        // '@'
    }

    static void Q3() {
        char char1 = '@';
        char char2 = '\u0040';
        char char3 = 64;
        System.out.println(char1 + char2 + char3);
        //prints 192 which is 64+64+64
        //Mind, doesnt print '@@@';
    }

    static void Q4() {
        char NL = 10;
        // a new line character

        /** char ch = ''; */
        // ERROR java: empty character literal

        System.out.print("ABCDEF");
        System.out.print('\r');
        System.out.print("1234");
        //"1234" is overwriting "ABCD.."
    }


    /****************************/
    /*CHARACTER OPERATIONS*/
    static void Q5() {
        char ch = 'a';
        ch += 1;
        // 'c'

        ch -= 2;
        // 'a'

        /** ch = ch -2;*/
        // Error
    }

    static void Q6() {
        char cha = 'b';
        // 98

        cha += 'a';
        // 98+97=195

        System.out.println(cha);
        // 'Ã'

        cha -= 'b';
        // 195-98=97

        System.out.println(cha);
        // 'a'
    }

    static void Q7() {
        char chb = 'A';
        chb += 10;
        System.out.println(chb); // 'K'
        System.out.println(++chb); // 'L'
        System.out.println(++chb); // 'M'
        System.out.println(--chb); // 'L'
    }


    public static void main(String[] args) {

        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
        Q6();
        Q7();
    }
}



/*
 A character can be also created using its hexadecimal code in the Unicode table.
 The code starts with <escape>\\u
 Range: '\u0000' - '\uffff'.
 Any char variable may be considered as an unsigned integer
 Range: 0 to 65535.
*/







/*
Q1:
UNICODE/UTF16 representation
0040 = '@' hex

Q2:
ASCII/DECIMAL representation
64 = '@' in ASCII

Q3:
char addition

Q4:
Carraige return character, \r
It moves the cursor back to beginning of the line

Q5:
Adding (+) and subtracting (-) integer numbers

Q6:
Adding and subtracting one characters
Use the ASCII values of chars for calculations

Q7:
prefix and postfix

Q8:
int z = 'z';
char mystery = z - 10;
System.out.println(mystery); ?

Q9:
char ch = 'e';
ch -= 'a';
ch++;
ch += 'b';
System.out.println(ch); ?

ANSWERS:
Q8: Compilation error
Q9: 'g'

*/








/*
ASCII table
0-9     : 48-57
A-Z     : 65-90
a-z     : 97-122
<space> : 32
@       : 64
new line: 10
*/