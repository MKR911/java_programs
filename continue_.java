import java.util.*;

public class continue_ {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("enter your number : ");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                continue;
            }
            if(n % 3 == 0) {
                break;
            }
            System.out.println(n);
        }while(true);
    }
}