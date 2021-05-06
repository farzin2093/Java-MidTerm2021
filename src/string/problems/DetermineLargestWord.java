package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String words[] = wordGiven.split(" ");
        String maxWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxWord.length()) {
                maxWord = words[i];
            }
        }
        map.put(maxWord.length(), maxWord);
        return map;
    }

    public static void main(String[] args) {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        for (String word : wordNLength.values()) {
            s = word.length() + " " + word;
        }
        System.out.println(s);
    }

}