package string.problems;







    /* function to check whether two strings are
    anagram of each other */

import java.util.Arrays;

 class Anagram {

    public static void main(String[] args) {
        String a = "TALE";
        String b = "LATE";

        boolean anagram = checkIfStringsAreAnagram(a, b);


        if (anagram) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }

    public static boolean checkIfStringsAreAnagram(String a, String b) {

        char[] firstArray = a.toUpperCase().toCharArray();
        char[] secondArray = b.toUpperCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);

    }
}