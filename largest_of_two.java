import java.util.*;

public class largest_of_two{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println("A in largest of two");
        }
        else if(a < b){
            System.out.println("B is the largest of two");
        }
        else{
            System.out.println("both are equal");
        }
    }
}