package basic;

import java.util.Scanner;

public class ReadFourWords {
    static String inString = "";

    static void getInput(Scanner sc){
        String inp = sc.nextLine();
        inString =  inString + inp + "\n";

        int words = inString.split("\n| ").length;
        if(words < 4 ){
            getInput(sc);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getInput(sc);

        String[] wordsAll = inString.split("\n| ");
        for(int i=0; i<4; i++){
            System.out.println(wordsAll[i]);
        }
        sc.close();
    }

/*   Or a simpler way,

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println(sc.next());
        }
    }*/
}

/*
Sample input:
I
Know
Java well
*
Sample Op:
I
Know
Java
well
*/