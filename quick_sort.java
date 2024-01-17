import java.util.*;
public class quick_sort {
    
    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j]; 
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
    
    public static void quickSort(int arr[], int si, int ei) {
        
        if(si >= ei){
            return;
        }
        int index = partition(arr, si, ei);
        quickSort(arr, index+1, ei);
        quickSort(arr, si, index-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i = 0; i < arr.length; ++i){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }   
}