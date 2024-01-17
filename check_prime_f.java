import java.util.*;

public class check_prime_f {
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
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isP = isPrime(n);

        if(isP == true) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }
    }
}
