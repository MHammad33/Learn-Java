import java.util.Scanner;

public class Hollow_Rectangular_Pattern {
    public static void main(String[] args) {
         /*
         2. Hollow Rectangular Pattern
                    *****
                    *   *
                    *   *
                    *****
         */

        // Added Scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        // Getting rows and columns from user
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        System.out.println("----- Hollow Rectangular Pattern -----");
        // outer loop
        for (int i = 1; i <= rows; i++) {
            // inner loop ->  matrix -> [i, j]
            for (int j = 1; j <= columns; j++) {
                // Print Stars
                if(i == 1 || j == 1 || i == rows || j == columns) System.out.print("*");
                // Print spaces
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
