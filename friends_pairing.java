import java.util.*;
public class friends_pairing {
    public static int friendPairing(int n) {
        if(n == 2 || n == 1){
            return n;
        }
        int fs = friendPairing(n-1);
        int fp = friendPairing(n-2);

        int pair_ways = (n-1) * fp;

        int totWays = fs + pair_ways;

        return totWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(friendPairing(n)); 
    }
}
