import java.util.*;

public class max_subarray_sum1 {
    public static int bruteForce(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int k = 0; k < numbers.length; k++){
            int start = k;
            for(int i = k; i < numbers.length; i++){
                int end = i;
                curr = 0;
                for(int j = start; j <= end; j++){
                    curr += numbers[j];
                }
                System.out.println(curr);
                if(max < curr){
                    max = curr;
                }
            }
        }
        return max;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int numbers[] = new int[5];

        for(int i = 0; i < numbers.length; ++i){
            numbers[i] = sc.nextInt();
        }

        System.out.println("MAX = " + bruteForce(numbers));
    }
}