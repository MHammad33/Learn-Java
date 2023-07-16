import java.util.Scanner;

public class Zero_One_Triangle_Pattern {
    public static void main(String[] args) {
        /*
         9.  Zero One (0 1) Triangle
                            1
                            0  1
                            1  0  1
                            0  1  0  1
                            1  0  1  0  1
         */

        // Added Scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        // Getting lines from user
        System.out.print("Enter lines: ");
        int lines = sc.nextInt();

        System.out.println("----- Zero One Triangle -----");
        // outer loop
        for (int i = 1; i <= lines; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0) System.out.print("1 "); // even
                else System.out.print("0 "); // odd

            }
            System.out.println();
        }

    }
}
