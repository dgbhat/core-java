package basic;

public class Strings {

    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
        Q4();
    }

    static void Q1() {
        String s1 = "a";
        String s2 = s1;
        s1 = s1.concat("b");
        System.out.println(s1); //"ab"

        String s3 = "java";
        s3.concat(" rules");
        System.out.println("s3 refers to " + s3);
        //Yes, s1 still refers to "java"
    }

    static void Q2() {
        String s1 = "";
        String s2 = null;
        String s3 = "text";
        String s4 = new String("text"); //avoid this
        String s5;
    }

    static void Q3() {
        String s1 = "a";

        s1.isEmpty();
        s1.length();
        s1.trim();

        s1.equals("a");
        s1.equalsIgnoreCase("A");
        s1.contains("a");

        s1.toUpperCase();
        s1.toLowerCase();

        s1.startsWith("a");
        s1.startsWith("a",0); //(string, fromIndex)
        s1.endsWith("a");
    }

    static void Q4() {
        String s1 = "hello hello";

        int index = s1.indexOf('e'); //(char)
        int index2 = s1.indexOf(101); //(char)
        int index3 = s1.indexOf("lo"); //(String)
        int index4 = s1.indexOf('l', 3); //(char, fromIndex) inclusice
        int index5 = s1.indexOf("lo", 3); //(String, fromIndex) inclusice

        System.out.println(index2); //1

        int index6 = s1.lastIndexOf('l');
        int index7 = s1.lastIndexOf("lo");
        int index8 = s1.lastIndexOf('l', 2); //(char, toIndex) inclusive
        int index9 = s1.lastIndexOf('l', 1);

        System.out.println(index6); //9
        System.out.println(index8); //2
        System.out.println(index9); //-1

    }

}


/*
Non-primitive type
String is Immutable. ref Q1
String Constant Pool, ref below

* */


/*
Q1:
Immutable concept
String s1 = "a";
//a new String object is created which contains "a" [Obj1]
//s1 is a reference to this obj
String s2 = s1;
//s2 also now refers to same obj
//Mind that no new String is created here, only a new ref variable is created
s1.concat("b");
//new String obj is created, it contains "b", [Obj2]
//new String obj is created, containing "ab", [Obj3]
s1 = s1.concat("b");
//now s1 refers to the 3rd String object "ab".
Hence the String itself is not mutated.
Instead a new String obj is created and the referance to that is assigned to the variable

String s3 = "java";
s3.concat(" rules");
//The VM creates another new String "java rules", but nothing refers to it. So, the second String is instantly lost. We can't reach it.

Q2:
String initializations
new String("text");
//explicitly creates a new and referentially distinct instance of a String object;
String s = "text";
//may reuse an instance from the string constant pool if one is available.

String s5; and String s2 = null; are same.
// s5.length() =NullpointerEx
String s1 = "";
//s1.length() =0

Q3:
Basic methods

Q4:
indexOf methods

Q5:

* */



/*
IMMUTABILITY:
Almost every method, applied to a String object in order to modify it, creates new String object. So, where do these String objects go? Well, these exist in memory, and one of the key goals of any programming language is to make efficient use of memory.

As applications grow, it's very common for String literals to occupy large area of memory, which can even cause redundancy. So, in order to make Java more efficient, the JVM sets aside a special area of memory called the "String constant pool".

When the compiler sees a String literal, it looks for the String in the pool. If a match is found, the reference to the new literal is directed to the existing String and no new String object is created. The existing String simply has one more reference. Here comes the point of making String objects immutable:

In the String constant pool, a String object is likely to have one or many references. If several references point to same String without even knowing it, it would be bad if one of the references modified that String value. That's why String objects are immutable.

Well, now you could say, what if someone overrides the functionality of String class? That's the reason that the String class is marked final so that nobody can override the behavior of its methods.

See https://stackoverflow.com/a/17942294
* */