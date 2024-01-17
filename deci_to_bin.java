import java.util.*;

public class deci_to_bin {

    public static void deciToBin( int num) {
        int bin = 0;
        int new_num = num;
        int pow = 0;

        while(new_num > 0){
            int rem = new_num % 2;
            bin = bin + (rem * (int)Math.pow(10,pow));

            pow++;
            new_num = new_num / 2;
        }

        System.out.println("binary of " + num + " is " + bin);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int deci = sc.nextInt();

        deciToBin(deci);
    }
}
