import java.util.*;

public class bubble_sort {
    
    public static void bubbleSort(int numbers[]) {
        for(int i = 0; i < numbers.length-1; i++){
            int swaps = 0; 
            for(int j = 0; j < numbers.length-i-1; j++){
                if(numbers[j] > numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0){
                break;
            }
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];

        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = sc.nextInt();
        }

        bubbleSort(numbers);
    }
}
