import java.util.Scanner;

public class Task5 {
    
    public static int[][] transposeMatrix(int[][] matrix, int n) {
        int[][] transposed = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();
        
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int[][] transposedMatrix = transposeMatrix(matrix, n);
        
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
