import java.util.*;

public class is_palindrome {

    public static boolean isPalindrome(int n) {
        int temp = n;
        int reverse = 0;
        int rem = 0;

        while(temp != 0){
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;

        }

        if(n == reverse){
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        System.out.println("the no. you provided is palindrome : " + isPalindrome(num));
    }
}
