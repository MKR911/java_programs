import java.util.*;
public class find_first_occurence {
    public static int findPos(int arr[],int key,int len){
        if(len == arr.length){
            return -1;
        }
        else if(arr[len] == key){
            return len;
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
