package Easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MostRepeatedWordInFile {
    static HashMap<String, Integer> wordsMap = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException{
        getWords();
        getMaxOccurance();
    }

    static void getWords() throws FileNotFoundException {
        Scanner file = new Scanner(new File("D:\\DGB\\Study\\Git\\core-java\\java basic\\Javabasics.txt"));
        while (file.hasNext()) {
            String word = file.next();
            Integer count = wordsMap.get(word);

            if(count == null) wordsMap.put(word, 1);
            else wordsMap.put(word, ++count);
        }
        file.close();
    }

    static void getMaxOccurance() {
        int max = 1;
        String maxWord = "";
        for (Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxWord = entry.getKey();
            }
        }
        System.out.println(maxWord + " " + max);
    }
}


// https://www.geeksforgeeks.org/java-program-to-find-the-most-repeated-word-in-a-text-file/


/* pseudo code

main()
    getWords()
    getMax()

getWords()
	sc = Scanner(new File("filename"))
	while(sc.hasNext())
		word = sc.next()
		count = map.get(word)
		if count == null
			count = 1
		else
			count++
		map.put(word,count)

getMax()
	max = 1
	maxWord
	for(Entry<String,Integer> entry : map.entrySet())
		if entry.getValue() > max
			max = entry.getValue()
			maxWord = entry.getKey()

	sout(max, maxWord)

*/