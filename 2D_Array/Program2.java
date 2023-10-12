// Write a function which accepts a 2D array of integers and its size as arguments and displays the elements of middle row and the elements of middle column and their sum


public class Program2 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 3, 5, 4 },
                { 7, 6, 9 },
                { 2, 1, 8 }
        };
        displayMiddleRowColumn(matrix);
    }

    static void displayMiddleRowColumn(int[][] matrix) {
        int n = matrix.length;
        if (n % 2 == 0) {
            System.out.println("The matrix must be a square matrix with odd dimensions. i.e: 3x3, 5x5, 7x7");
            return;
        }

        int middle = n / 2;

        // Display the middle row
        System.out.print("Middle Row: ");
        int middleRowSum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[middle][i] + " ");
            middleRowSum += matrix[middle][i];
        }
        System.out.println();

        // Display the middle column
        System.out.print("Middle Column: ");
        int middleColumnSum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][middle] + " ");
            middleColumnSum += matrix[i][middle];
        }
        System.out.println();

        // Display the sums
        System.out.println("Middle Row Sum: " + middleRowSum);
        System.out.println("Middle Column Sum: " + middleColumnSum);
    }
}
