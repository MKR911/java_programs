import java.util.*;

public class avg {

    public static int avg_three_no(int a, int b, int c) {
        int $avg = (a + b + c)/3;

        return $avg;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print("Average of three numbers you entered is :" + avg_three_no(a, b, c));
    }
}
