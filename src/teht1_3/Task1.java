package teht1_3;
import java.util.Scanner;
import java.util.*;


public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a value to A: ");
        int a = sc.nextInt();

        System.out.println("Give a value to B: ");
        int b = sc.nextInt();

        System.out.println("Give a value to C: ");
        int c = sc.nextInt();

        double tulos = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Error, A cannot be zero");
        } else if (tulos > 0) {
            double root1 = (-b + Math.sqrt(tulos)) / (2 * a);
            double root2 = (-b - Math.sqrt(tulos)) / (2 * a);
            System.out.println("Roots are: " + root1 + ", " + root2);
        } else if (tulos == 0) {
            double root = (double) -b / (2 * a);
            System.out.println("Root is: " + root);
        } else {
            System.out.println("No real roots.");
        }

    }
}
