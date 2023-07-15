import java.util.Scanner;

public class Inverted_Half_Pyramid_Pattern {
    public static void main(String[] args) {
         /*
         4. Inverted Half Pyramid Pattern
                            *****
                            ****
                            ***
                            **
                            *
         */

        // Added Scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        // Getting lines from user
        System.out.print("Enter rows: ");
        int lines = sc.nextInt();


        System.out.println("----- Inverted Half Pyramid Pattern -----");
        // outer loop
        for (int i = lines; i >= 1; i--) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
