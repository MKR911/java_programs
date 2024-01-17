import java.util.*;

public class largest_string_alphabetically {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String fruits[] = new String[5];

        for(int i = 0; i < fruits.length; i++){
            fruits[i] = sc.next();
        }

        String largest = fruits[0];
        
        for(int i = 1; i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}
