package teht1_3;
import java.util.Scanner;
public class Task2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        int decimal = 0;
        int length = binaryString.length();

        for (int i = 0; i < length; i++) {
            char bit = binaryString.charAt(length - 1 - i);
            if (bit == '1') {
                decimal += (int) Math.pow(2, i);
            }
        }

        System.out.println("The decimal equivalent is: " + decimal);
    }
}

