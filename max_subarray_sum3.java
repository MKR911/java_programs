import java.util.*;

public class max_subarray_sum3 {

    public static int kadanesAlgorithm(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        return ms;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[3];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("max subarray sum : " + kadanesAlgorithm(numbers));
    }
}
