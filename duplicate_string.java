import java.util.*;
public class duplicate_string {

    public static void removeDuplicateChar(String str, StringBuilder str1, int i, boolean map[]) {
        if(i == str.length()){
            System.out.println(str1);
            return;
        }

        char ch = str.charAt(i);

        if(map[ch - 'a']){
            removeDuplicateChar(str, str1, (i+1), map);
        }
        else{
            map[ch - 'a'] = true;
            removeDuplicateChar(str, str1.append(ch), (i+1), map);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        removeDuplicateChar(name,new StringBuilder(), 0, new boolean[100]);
    }
}
