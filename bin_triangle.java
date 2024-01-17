import java.util.*;

public class bin_triangle {

    public static void binTriangle(int row) {
        
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                if( (i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();

        binTriangle(rows);
    }
}
