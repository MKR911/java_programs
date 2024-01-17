import java.util.*;
public class find_subsets {

    public static void findSubsets(String str, String ans, int i){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //recursion 
        //yes choice 
        findSubsets(str, ans+str.charAt(i), i+1);
        //no choice 
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        findSubsets(str, "", 0);
    }
}
