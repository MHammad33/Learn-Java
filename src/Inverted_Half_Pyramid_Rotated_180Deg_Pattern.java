import java.util.Scanner;

public class Inverted_Half_Pyramid_Rotated_180Deg_Pattern {
    public static void main(String[] args) {
        /*
         5. Inverted Half Pyramid Pattern (Rotated 180 deg)
                            *
                           **
                          ***
                         ****
                        *****
         */

        // Added Scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        // Getting lines from user
        System.out.print("Enter lines: ");
        int lines = sc.nextInt();

        System.out.println("----- Inverted Half Pyramid Pattern (180 deg rotated) -----");
        // outer loop
        for (int i = 1; i <= lines; i++) {
            // inner loop -> print space
            for (int s = lines; s > i; s--) {
                // We can also use s from 1 to rows - i
                System.out.print(" ");
            }
            // inner loop -> print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print new line
            System.out.println();
        }
    }
}
