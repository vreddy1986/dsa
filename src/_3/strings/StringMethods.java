package _3.strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name ="Vinith Reddy";

        //toCharArray(): Converts the string to a char array
        char[] chArray = name.toCharArray();
        System.out.println(Arrays.toString(chArray));

        //string.length():returns the length of the string.
        System.out.println(name.length());

        //string.contains(CharSequence ch)
        //method checks whether the specified string (sequence of characters) is present in the string or not
        System.out.println(name.contains("ddy"));

        //string.charAt(int index): Get a character at a given index in the String
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));

        //string.indexOf(int ch, int fromIndex)/ indexOf(String str, int fromIndex)
        //returns the index of the first occurrence of the specified character/substring within the string; -1 else
        System.out.println(name.indexOf('h'));
        System.out.println(name.indexOf("Reddy"));

        //string.substring(int startIndex, int endIndex)
        //extracts a substring from the string and returns it.
        System.out.println(name.substring(0, 4));

        //string.split(String regex, int limit)
        //divides the string at the specified regex and returns an array of substrings.
        String[] result = name.split(" ");
        System.out.println(Arrays.toString(result));
        String[] result1 = name.split("");
        System.out.println(Arrays.toString(result1));

        //string.startsWith(String str, int offset)
        //checks whether the string begins with the specified string or not.
        System.out.println(name.startsWith("Java"));
        System.out.println(name.startsWith("Vini"));

        //string.isEmpty(): checks whether the string is empty or not.
        System.out.println(name.isEmpty()); // false
        String name2="";
        System.out.println(name2.isEmpty()); // true

        //lastIndexOf() method returns the position of the last occurrence of specified character(s) in a string.
        System.out.println(name.lastIndexOf('i'));

        //trim(): removes any leading (starting) and trailing (ending) non unicode whitespaces from the specified string
        System.out.println(name.trim());

        //strip(): removes any leading (starting) and trailing (ending) unicode whitespaces from the specified string
        System.out.println(name.trim());

        //string.replace(char oldChar, char newChar)/string.replace(CharSequence oldText, CharSequence newText)
        //replaces each matching occurrence of the old character/text in the string with the new character/text.
        String str1 = "bat ball";
        // replace b with c
        System.out.println(str1.replace('b', 'c'));

    }
}
