import java.util.*;

public class reverse_array {

    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        int temp = 0;

        while(first < last){
            temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];

        System.out.println(numbers.length);
        
        for(int i = 0; i < numbers.length; ++i){
            numbers[i] = sc.nextInt();
        }

        reverse(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
