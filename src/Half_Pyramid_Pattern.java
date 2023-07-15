import java.util.Scanner;

public class Half_Pyramid_Pattern {
    public static void main(String[] args) {
        /*
         3. Half Pyramid Pattern
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

        System.out.println("----- Half Pyramid Pattern -----");
        // outer loop
        for (int i = 1; i <= lines; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
