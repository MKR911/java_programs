import java.util.*;

public class substring {

    public static String sustring(String str, int si, int ei) {
        String substr = "";
        for(int i = si; i < ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(sustring(str, 0, 5));

        System.out.println(str.substring(2,8));
    }
}
