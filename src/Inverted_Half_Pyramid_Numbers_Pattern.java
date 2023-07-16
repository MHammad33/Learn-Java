import java.util.Scanner;

public class Inverted_Half_Pyramid_Numbers_Pattern {
    public static void main(String[] args) {
        /*
         7. Inverted Half Pyramid Pattern
                            12345
                            1234
                            123
                            12
                            1
         */

        // Added Scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        // Getting lines from user
        System.out.print("Enter lines: ");
        int lines = sc.nextInt();

        System.out.println("----- Inverted Half Pyramid with numbers Pattern -----");
        // outer loop
        for (int i = lines; i >= 1; i--) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                // We can also use from j = t to rows-i+1
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
