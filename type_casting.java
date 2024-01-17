public class type_casting {
    public static void main(String args[]) {
        float number = 99.999f;
        double num = number;   // implict type conversion.
        int num2 = (int) number;   // type casting.
        char ch = 'a';   // type casting.
        int num3 = (int) ch;  // type casting. 
        char ch1 = (char) num2;   // type casting.
        System.out.println(number);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(ch1);
    }
}