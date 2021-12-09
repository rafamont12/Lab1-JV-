package Task6;

public class Task6 {
    public static void T(int[][] matrix) {
        int rows = matrix[0].length;
        int cols = matrix.length;

        int[][] tmatrix = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                tmatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("Транспонована матриця:");
        PrintMatrix(tmatrix);
    }

    public static void PrintMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1, 5, 2},
                {2, 9, 7},
                {6, 3, 2},
                {7, 1, 0},
                {2, 6, 4}
        };

        System.out.println("Матриця:");
        PrintMatrix(matrix);

        T(matrix);
    }
}
