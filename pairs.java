import java.util.*;


public class pairs {

    public static void printPairs(int numbers[]) {
        for(int i = 0; i < numbers.length-1; i++){
            int curr = numbers[i];
            for(int j = i + 1; j < numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int numbers[] = new int[10];

        for(int i = 0; i < numbers.length; ++i){
            numbers[i] = sc.nextInt();
        }

        printPairs(numbers);
    }
}
