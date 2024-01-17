import java.util.*;

public class bin_to_deci {
    public static void binToDeci(int num) {
        int decNum = 0;
        int pow = 0;
        int org = num;

        while(num > 0) {
            int lastDigit = num % 10;
            decNum += (lastDigit * (int)Math.pow(2, pow));

            pow++;
            num /= 10;
        }

        System.out.println("decimal of " + org + " = " + decNum);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int bin = sc.nextInt();

        binToDeci(bin);
    }
}
