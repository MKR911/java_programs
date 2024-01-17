import java.util.*;

public class rev_num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int last_digi = 0;
        int num2 = 0;
        int num3 = num; 

        while(num > 0){
            last_digi = num % 10;
            num2 = num2 * 10 + last_digi;
            num /= 10;
        }
        System.out.print("reverse of " + num3 + " is " + num2);
    }
}