import java.util.*;

public class update_array {

    public static void update(int marks[]) {
        for(int i = 0; i < marks.length; i++){
            marks[i] += 1;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[3];

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        update(marks);

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
