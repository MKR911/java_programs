import java.util.*;

public class matrices {

    public static void search(int matrix[][], int key) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.print("found at cell (" + i + "," + j + ")");
                }
            }
        }
        System.out.println("key not found.");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int matrix[][] = new int[3][3];

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int key = sc.nextInt();

        search(matrix, key);
    }
}
