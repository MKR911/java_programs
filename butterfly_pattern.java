
import java.util.*;

public class butterfly_pattern {

    public static void pattern(int row) {
        //first half
        for(int i = 1; i <= row; i++) {
            
            //stars - i
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            //spaces - 2*(n-i)
            for(int j = 1; j <= (2*(row - i)); j++) {
                System.out.print("  ");
            }

            //stars - i
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = row; i >= 1; i--) {
            
            //stars - i
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            //spaces - 2*(n-i)
            for(int j = 1; j <= (2*(row - i)); j++) {
                System.out.print("  ");
            }

            //stars - i
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        pattern(row);
    }
}
