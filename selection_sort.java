import java.util.*;

public class selection_sort {

    public static void selectionSort(int numbers[]) {
        for(int i = 0; i < numbers.length - 1; i++){
            int minPos = i;
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[minPos] > numbers[j]){
                    minPos = j;
                }
            }

            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;
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
        selectionSort(numbers);
    }
}
