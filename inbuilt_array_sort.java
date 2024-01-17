import java.util.*;   // * -> means we can use any class or function but we can also use array here for calling inbuilt array sort.
import java.util.Collections;

public class inbuilt_array_sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
