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
        // put your code here
        Scanner sc = new Scanner(System.in);
        getInput(sc);

        String[] wordsAll = inString.split("\n| ");
        for(int i=0; i<4; i++){
            System.out.println(wordsAll[i]);
        }
    }
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