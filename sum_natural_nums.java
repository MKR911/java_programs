import java.util.*;

public class sum_natural_nums {

    public static int sumNaturalaNums(int n) {
        if(n == 1){
            return 1;
        }
        return n + sumNaturalaNums(n - 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int sum = sumNaturalaNums(n);
        System.out.println("Sum of " + n + " natural numbers = " + sum);
    }
}