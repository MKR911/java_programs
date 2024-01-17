import java.util.*;

public class half_pyramid {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        for(int line = 1 ; line <= row ; line++){
            for(int r = 1 ; r <= line ; r++) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}
