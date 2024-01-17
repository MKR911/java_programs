import java.util.*;

public class check_power_of_two {

    public static boolean isPowerOfTwo(int n) {
        return (n&(n - 1)) == 0;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isPowerOfTwo(n));
    }
}
