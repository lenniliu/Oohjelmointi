package Teht1_2;
import java.util.Scanner;
public class task3 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Anna paino (g): ");
        int weight = Integer.parseInt(reader.nextLine());

        double luoti = 13.28;
        int naula = (int) (32 * luoti);
        int leiviska = 20 * naula;

        int JakoLeiviska = weight/leiviska;
        int jakoNaula = (weight%leiviska) / naula;
        double jakoLuoti = (((double) weight % leiviska) % naula) / luoti;

        System.out.printf(weight + " grams is " + JakoLeiviska + " leiviskä, " + jakoNaula + " naula, and %.2f luoti", jakoLuoti);

    }
}
