import java.util.*;

public class ascending {

    public static void printIncrising(int n) {
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        
        printIncrising(n - 1);
        System.out.print(n + " ");
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printIncrising(n);
    }
}
