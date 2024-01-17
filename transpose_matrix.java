import java.util.Scanner;

public class transpose_matrix {

    public static void transpose(int matrix[][]) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        int transpose[][] = new int[col][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                
                transpose[j][i] = matrix[i][j];

            }
        }

        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int matrix[][] = new int[2][3];

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

        transpose(matrix);
        
    }
}

