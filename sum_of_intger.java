import java.util.*;

public class sum_of_intger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num;
        int choice;
        int sum_even = 0;
        int sum_odd = 0;
        choice = 1;

        while(choice == 1){
            num = sc.nextInt();
            if(num % 2 == 0){
                sum_even += num;
            }else{
                sum_odd += num;
            }

            System.out.print("if you want to continue press 1: ");
            choice = sc.nextInt();


        }

        System.out.println("sum of even numbers = " + sum_even);
        System.out.println("sum of odd numbers = " + sum_odd);
    }
}
