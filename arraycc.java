import java.util.*;

public class arraycc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[50];
        int numbers[] = {1, 2, 3};
        String fruits[] = {"apple", "banana", "cherry"};

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        marks[2] = marks[2] + 1;

        System.out.println("math : " + marks[2]);

        System.out.println("length of array : " + marks.length);
    }
}
