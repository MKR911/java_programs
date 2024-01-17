import java.util.*;

public class factriol {
    
    public static int fact(int n) {
        // int f = 1;

        // for(int i = 1; i <= n; i++){
        //     f *= i;
        // }
        // return f;

        if(n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int f = fact(n);

        System.out.println("Factorial of " + n + " = " + f);
    }
}
