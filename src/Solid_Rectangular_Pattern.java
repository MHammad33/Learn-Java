// Scanner Library for inputs
import java.util.Scanner;

public class Solid_Rectangular_Pattern {
    public static void main(String[] args) {
        /*
         1. Solid Rectangular Pattern
                    *****
                    *****
                    *****
                    *****
         */

        // Added Scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        // Getting rows and columns from user
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        System.out.println("----- Solid Rectangular Pattern -----");
        // outer loop
        for (int i = 1; i <= rows; i++) {
            // inner loop -> print stars
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
