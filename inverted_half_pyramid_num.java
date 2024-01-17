import java.util.*;

public class inverted_half_pyramid_num {

    public static void numHalfInvertedPyramid(int row) {
        
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= row - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();

        numHalfInvertedPyramid(rows);
    }
}
