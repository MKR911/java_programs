import java.util.*;

public class fast_exponation {

    public static int fastExponation(int a, int n) {
        int ans = 1;

        while(n > 0){
            if((n&1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(fastExponation(a, n));
    }
}
