import java.util.*;

public class type_numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;

        while(count <= n){
            System.out.print(count + " ");
            count++;
        }
        
        System.out.println("\nnumbers till " + --count);
    }
}