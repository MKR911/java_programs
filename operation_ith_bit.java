import java.util.*;

public class operation_ith_bit {

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int setIthBit(int n, int i) {
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int getIthBit(int n , int i) {
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        } else{
            return 1;
        }
    }

    public static int updateIthBit(int n, int i, int newbit) {
        /*if(newbit == 0){
            return clearIthBit(n, i);
        } else{
            return setIthBit(n, i);
        }*/

        n = clearIthBit(n, i);
        int bitmask = newbit<<i;
        return n | bitmask;
    }

    public static int clearBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;

        int bitMask = a|b;

        return n&bitMask;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = sc.nextInt();

        System.out.println(getIthBit(n, i));
        System.out.println(setIthBit(n, i));
        System.out.println(clearIthBit(n, i));

        int newbit = sc.nextInt();

        System.out.println(updateIthBit(n, i, newbit));

        int nc = sc.nextInt();
        int ic = sc.nextInt();

        System.out.println(clearBits(nc, ic));

        int ncr = sc.nextInt();
        int jcr = sc.nextInt();
        int icr = sc.nextInt();

        System.out.println(clearRangeOfBits(ncr, icr, jcr));
    }
}
