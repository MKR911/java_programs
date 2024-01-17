import java.util.*;

public class floyds_triangle {

    public static void floydTriangle(int row) {
        int count = 1;
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();

        floydTriangle(rows);
    }
}
