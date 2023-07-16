import java.util.Scanner;

public class Half_Pyramid_Numbers_Pattern {
    public static void main(String[] args) {
        /*
         6. Half Pyramid with numbers Pattern
                    1
                    12
                    123
                    1234
                    12345
         */

        // Added Scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        // Getting lines from user
        System.out.print("Enter lines: ");
        int lines = sc.nextInt();

        System.out.println("----- Half Pyramid with numbers pattern-----");
        // outer loop
        for (int i = 1; i <= lines; i++) {
            // inner loop -> print stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print new line
            System.out.println();
        }
    }
}
