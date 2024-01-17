import java.util.*;

public class counting_sort {

    public static void countingSort(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            largest = Math.max(largest, numbers[i]);
        }

        int count[] = new int[largest + 1];
        for(int i = 0; i < numbers.length; i++){
            count[numbers[i]]++;
        }

        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                numbers[j] = i;
                j++;
                count[i]--;
            }
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
        countingSort(numbers);
    }
}
