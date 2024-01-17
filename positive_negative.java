import java.util.*;

public class positive_negative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num == 0){
            System.out.println("number you entred is zero.");
        }
        else if(num > 0){
            System.out.println("number you entered is positive.");
        }
        else{
            System.out.println("number you entered is negative.");
        }
    }
}
