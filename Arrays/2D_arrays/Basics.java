import java.util.Scanner;

public class Basics{

    public static boolean Search(int matrix[][] , int key) {
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.print("Matrix (i:" + i + ", j:" + j + ")");
                    return true;
                }
                System.out.println();
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();

         System.out.print("Enter no. of columns: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];
        int n = matrix.length , m = matrix[0].length;
        //input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        // int key = 3;
        // Search(matrix, key);
    }
}