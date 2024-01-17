import java.util.*;

public class spiral_matrix {

    public static void printspiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        //int spiral[][] = new int[3][3];

        while(startRow <= endRow && startCol <= endCol) {
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
                //spiral[startRow][j] = matrix[startRow][j];
            }

            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
                //spiral[i][endCol] = matrix[i][endCol];
            }

            for(int j = endCol - 1; j >= startCol; j--){
                /*if(startRow == endRow){
                    break;
                }*/
                System.out.print(matrix[endRow][j] + " ");
                //spiral[endRow][j] = matrix[endRow][j];
            }

            for(int i = endRow - 1; i >= startRow + 1; i--){
                /*if(startCol == endCol){
                    break;
                }*/
                System.out.print(matrix[i][startCol] + " ");
                //spiral[i][startCol] = matrix[i][startCol];
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }


        /*for(int i = 0; i < spiral.length; i++){
            for(int j = 0; j < spiral[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int matrix[][] = new int[5][5];

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        printspiral(matrix);
    }
}
