import java.util.*;

public class max_subarray_sum2 {

    public static int prefixSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for(int k = 0; k < numbers.length; k++){
            int start = k;
            for(int i = k; i < numbers.length; i++){
                int end = i;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("max sum" + prefixSum(numbers));
    }
}
