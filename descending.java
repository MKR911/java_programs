import java.util.*;

public class descending {

    public static void printDecrising(int n) {
        if(n == 1){
            System.out.print(n);
            return;
        }
        
        System.out.print(n + ",");
        printDecrising(n - 1);
    }
    public static void main(String args[]) {
        int n = 10;
        printDecrising(n);
    }
}
