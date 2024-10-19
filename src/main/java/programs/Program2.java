package programs;

import java.util.Arrays;

public class Program2 {
    // write a program to check 2 strings are anagram or not
    public static void main(String[] args) {
//        String str1 = "Earth ";
//        String str2 = "Heart";

        // example 2:
        String str1 = "Eleven plus two !!";
        String str2 = "Twelve plus one";

        String normalizeStr1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String normalizeStr2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] charArray1 = normalizeStr1.toCharArray();
        char[] charArray2 = normalizeStr2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean result = Arrays.equals(charArray1, charArray2);
        if (result == true) System.out.println(str1 + " and " + str2 + " are anagram");
        else System.out.println(str1 + " and " + str2 + " are NOT anagram");
    }
}
