import java.util.*;

public class strings {
    public static void main(String args[]) {
        char arr[] = {'a','b' ,'c' ,'d'};
        String str = "abcd";
        String str2 = new String("abcd");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println(name);

        System.out.println(name.length());

        if(str.equals(str2)){
            System.out.println("they are equal.");
        } else{
            System.out.println("they are not equal.");
        }

        String str3 = str + " " + str2;

        System.out.println(str3 + " mkr");

        
    }    
}
