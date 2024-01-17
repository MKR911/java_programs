import java.util.*;

public class diamond {
    public static void diamondPattern(int n) {
        
        for(int i = 1; i <= n; i++) {
            for(int j = n - 1; j >= i; j--){
                System.out.print("  ");
            }
            for(int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = n; i >= 1; i--) {
            for(int j = n - 1; j >= i; j--){
                System.out.print("  ");
            }
            for(int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();

        diamondPattern(rows);
    }
}
