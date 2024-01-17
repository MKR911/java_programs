import java.util.*;
public class fibonacci {
    
    /*public static void fibo(int n,int a, int b, int count){

        if(count==n){
            return;
        }
        System.out.print(a + " ");
        fibo(n, b, (a+b), ++count);
        return;
    }
    */
    public static int fibo(int n){
        if(n==1 || n==0){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number till you want series to get printed  ");
        int n = sc.nextInt();
        int j = fibo(n);
        System.out.println(j);
    }
}
