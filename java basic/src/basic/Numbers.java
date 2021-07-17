package basic;

public class Numbers {
    byte maxByte = 127;
    byte minByte = -128;
    int intMax = 2_147_483_647;
    int intMin = -2_147_483_648;
    static int intMax2 = Integer.MAX_VALUE;
    static int intMin2 = Integer.MIN_VALUE;
    static long longNum = 1_000_000_000_000L; /* L is mandatory*/
    float pi = 3.141f;
    /*If f is not specified,
    Err: incompatible types: possible lossy conversion from double to float*/
    double piValue = 3.1415;
    double pivalue2 = 3.1d;

    static void Q(){
        /* casting */
        float f = (float) 20d + 20.02f;
        long n = 10 + 2L;
        byte b = (byte) (n + 5);
    }

    public static void main(String[] args) {
        System.out.println(intMax2);
        System.out.println(Byte.SIZE + "\t" + Character.SIZE);
    }
}



/*
Range Formula : from −2^(n−1) to 2^(n−1) −1

Primitive number types :
byte: size 8 bits (1 byte), range from -128 to 127
short: size 16 bits (2 bytes), range from -32768 to 32767
int: size 32 bits (4 bytes), range from −2147483648 to 2_147_483_647
long: size 64 bits (8 bytes), range from −(2^63) to (2^63)−1
float: size 32 bits (4 bytes)
double: size 64 bits (8 bytes)

Use int if number is:
< 2 Billion OR <= 9 digits

Use long if number is:
<= 18 digits

Use float/double for decimal points:
about 6 in float
about 14 in double
* */