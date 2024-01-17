import java.util.*;

public class prime_range {
    public static boolean isPrime(int num) {
        boolean isPrime = true;

        for(int i = num/2; i > 1 ; i--) {

            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
        
    }
    
    public static void prime_in_range(int n) {
        
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        prime_in_range(n);
    }
}
