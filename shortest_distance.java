import java.util.*;

public class shortest_distance {

    public static float getShortestPath(String path) {
        int x = 0, y = 0;

        for(int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }

        int x_sq = x * x;
        int y_sq = y * y;

        return (float)Math.sqrt(x_sq + y_sq);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String path = sc.next();

        float displacement = getShortestPath(path);

        System.out.println(displacement);
    }
}
