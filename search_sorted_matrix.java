import java.util.*;

public class search_sorted_matrix {

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            }

            else if(key < matrix[row][col]){
                col--;
            }

            else{
                row++;
            }
        }
        System.out.println("key not found.");

        return false;
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

        staircaseSearch(matrix, key);
    }
}
