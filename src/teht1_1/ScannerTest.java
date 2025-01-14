package teht1_1;
import java.util.Scanner;


public class ScannerTest {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number: ");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number: ");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println(first + second + third);
        System.out.println(first * second * third);
        System.out.println((first + second + third) / 3);
    }
}
