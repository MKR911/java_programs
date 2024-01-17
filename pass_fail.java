import java.util.*;

public class pass_fail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int marks_total = sc.nextInt();
        
        String result = (marks_total >= 33) ? "PASS" : "FAIL";
        System.out.println(result);
    }
}