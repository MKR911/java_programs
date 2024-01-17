 import java.util.*;

public class print_subarray {
    public static void printsubarray(int numbers[]) {
        for(int k = 0; k < numbers.length; k++){
            int start = k;
            for(int i = k; i < numbers.length; i++){
                int end = i;
                for(int j = start; j <= end; j++){
                    System.out.print(numbers[j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int numbers[] = new int[10];

        for(int i = 0; i < numbers.length; ++i){
            numbers[i] = sc.nextInt();
        }

        printsubarray(numbers);
    }
}

