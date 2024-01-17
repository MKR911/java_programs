import java.util.*;
public class find_last_occurence {
    public static int findPos(int arr[],int key,int len){
        if((arr.length - len) == 0){
            return -1;
        }
        else if(arr[(arr.length - len - 1)] == key){
            return (arr.length - len - 1);
        }
        return findPos(arr, key, ++len);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {6,3,8,8,9,5,1,2,3,7,8,4};
        System.out.print("Enter the key you want to find: ");
        int f = sc.nextInt();

        int index = findPos(arr, f, 0);
        if(index == -1){
            System.out.println("The key entered " + f +  " was not found.");
        }
        else{
            System.out.println("The key entered " + f + " was found at the index " + index + ".");
        }
    }
}
