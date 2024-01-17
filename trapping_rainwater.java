 import java.util.*;

public class trapping_rainwater {

    public static int trappingRainwater(int height[]) {
        int n = height.length;
        int l_max[] = new int[n];
        int r_max[] = new int[n];
        l_max[0] = height[0];
        r_max[n - 1] = height[n - 1];

        for(int i = 1; i < n; i++){
            l_max[i] = Math.max(height[i], l_max[i-1]);
            r_max[n - 1 - i] = Math.max(height[n - 1 - i], r_max[n - i]);
        }

        int trappedWater = 0;
        for(int i = 1; i < n - 1; i++){
            int waterlevel = Math.min(l_max[i], r_max[i]);

            trappedWater += waterlevel - height[i];
        }

        return trappedWater;
    }
    public static void main(String args[]) {
        int height[] = {4,2,2,2,1,0,6};

        System.out.println(trappingRainwater(height));
    }
}
