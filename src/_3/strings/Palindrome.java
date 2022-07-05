package _3.strings;

// String should be same whiel reading it from either sides
public class Palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("String:\"" + str +"\" is a Palindrome:" +checkPalindrome(str));

        String str1 = "abcdcba";
        System.out.println("String:\"" + str1 +"\" is a Palindrome:" +checkPalindrome(str1));

        String str2 = "vinith";
        System.out.println("String:\"" + str2 +"\" is a Palindrome:" +checkPalindrome(str2));
    }

    private static boolean checkPalindrome(String str){
        if(str==null || str.length()==0){
            return true;
        }

        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
