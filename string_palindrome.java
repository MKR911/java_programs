import java.util.*;

public class string_palindrome {

    public static boolean isPalindrome(String str){
        int n = str.length();
        
        for(int i = 0; i < n; i++){
            if(str.charAt(i) != str.charAt(n - i - 1)){
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        System.out.println("the word you entered is palindrome : " + isPalindrome(word));
    }
}
