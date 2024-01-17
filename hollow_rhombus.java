import java.util.*;

public class hollow_rhombus {
    public static void hRhombus(int n) {
        
        for(int i = 1; i <= n; i++) {

            for(int j = n - 1; j >= i; j--) {

                System.out.print("  ");

            }
            for(int j = 1; j <= n; j++) {

                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();

        hRhombus(rows);
    }
}
