import java.util.*;

public class insertion_sort {

    public static void insertionSort(int numbers[]) {
        for(int i = 1; i < numbers.length; i++){
            int curr = numbers[i];
            int prev = i - 1;

            while(prev >= 0 && numbers[prev] > curr){
                numbers[prev + 1] = numbers[prev];
                prev--;
            }

            numbers[prev + 1] = curr;
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        insertionSort(numbers);
    }
}
