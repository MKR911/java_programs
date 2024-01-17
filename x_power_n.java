import java.util.*;
public class x_power_n {
/*  
    public static int xPowN(int x, int n) {
        if(n == 1){
            return x;
        }
        return x * xPowN(x, (n-1));
    }
*/
    public static int optimizedPower(int x, int n){
        
        if(n == 0){
            return 1;
        }
        
        int halfPower = optimizedPower(x, n/2) * optimizedPower(x, n/2);
        if(n%2 != 0){
            halfPower = x * halfPower;
        }
        return halfPower;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int pwr = optimizedPower(x, n);

        System.out.println("answer is " + pwr);
    }
}
