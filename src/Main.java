import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu : ");
        System.out.print("Hang : ");
        int rows = scanner.nextInt();
        System.out.print("Cot : ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        int max = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhap phan tu cot va hang (" + i + ", " + j + ")");
                matrix[i][j] = scanner.nextInt();
                if (i == j && j == 0) max = matrix[i][j];
                if (matrix[i][j] > max) max = matrix[i][j];
            }
        }

        System.out.println("Mang 2 chieu :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Max = " + max);
    }
}