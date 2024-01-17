import java.util.*;

public class even_odd {

    public static void isEvenOdd(int n) {
        /*if(n % 2 == 0){
            System.out.println(n + " is even.");
        } else{
            System.out.println(n + " is odd.");
        }*/

        int bitMask = 1;

        if((n & bitMask) == 0){
            System.out.println("even number.");
        } else{
            System.out.println("odd number.");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        isEvenOdd(n);
    }
}