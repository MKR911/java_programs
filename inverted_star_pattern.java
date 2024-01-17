import java.util.*;

public class inverted_star_pattern {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int line = row ; line >= 1 ; line--) {
            for(int star = line ; star >= 1 ; star--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
