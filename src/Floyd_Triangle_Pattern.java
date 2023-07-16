import java.util.Scanner;

public class Floyd_Triangle_Pattern {
    public static void main(String[] args) {
        /*
         8. Floyd's Triangle
                            1
                            2  3
                            4  5  6
                            7  8  9  10
                            11 12 13 14 15
         */

        // Added Scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        // Getting lines from user
        System.out.print("Enter lines: ");
        int lines = sc.nextInt();

        System.out.println("----- Floyd's Triangle -----");
        // outer loop
        int n = 1;
        for (int i = 1; i <= lines; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(n++ + " ");
            }
            System.out.println();
        }
    }
}
