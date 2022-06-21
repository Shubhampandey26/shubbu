import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[rows][col];

        // input the elements in matrix
        //lets run a loop so that we can store elements in rows and cols
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // for transpose
        System.out.println("transpose of matrix is ");

        for(int j=0; j<rows; j++) {
            for(int i=0; i<col; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
