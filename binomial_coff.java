import java.util.*;

public class binomial_coff {
    public static int fact(int n) {
        int f = 1;

        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }
    
    public static int bin_coeff(int n, int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n - r);

        int bin_c = fact_n / (fact_r * fact_nmr);
        
        return bin_c;
    }
    
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(bin_coeff(n, r));
    }
}
