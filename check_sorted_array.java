import java.util.*;
public class check_sorted_array {
    public static boolean check_array(int arr[],int a){
        if(a == (arr.length - 1)){
            return true;
        }
        else if(arr[a+1] < arr[a]){
            return false;
        }
        return check_array(arr, ++a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean j = check_array(arr, 0);
        if(j){
            System.out.println("array is sorted.");
        }
        else{
            System.out.println("array is unsorted.");
        }
    }
}
