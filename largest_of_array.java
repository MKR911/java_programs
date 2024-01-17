import java.util.*;

public class largest_of_array {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = {1, 2, 3, 5, 4, 6, 9, 8, 7};

        System.out.println("Largest value is : " + getLargest(numbers));
    }
}
