import java.util.*;

public class diagonal_sum {

    public static void digSum(int matrix[][]) {
        int sum = 0;

        /*for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i == j){
                    sum += matrix[i][j];
                }
                else if(i + j == matrix.length - 1){
                    sum += matrix[i][j];
                }

            }*/

        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];
            if(i != matrix.length - 1 - i){
                sum += matrix[i][matrix.length - i - 1];
            }
        }

        System.out.println("sum of diagonals of matrix is " + sum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int matrix[][] = new int[4][4];

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

        digSum(matrix);
    }
}
