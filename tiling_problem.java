import java.util.*;
public class tiling_problem {
    public static int tilingProblem(int n) {
        
        if(n == 0 || n == 1){
            return 1;
        }
        int fnm1 = tilingProblem(n-1);
        int fnm2 = tilingProblem(n-2);
        int tot_ways = fnm1 + fnm2;
        return tot_ways;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int j = tilingProblem(n);
        System.out.println(j);
    }
}
