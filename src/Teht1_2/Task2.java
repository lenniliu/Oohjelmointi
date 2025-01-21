package Teht1_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Anna sivun A pituus: ");
        double a = Double.parseDouble(reader.nextLine());

        System.out.println("Anna sivun B pituus: ");
        double b = Double.parseDouble(reader.nextLine());

        double hypotenuusa = Math.sqrt(a*a + b*b);
        System.out.printf("Hypotenuusan pituus on: %1.2f", hypotenuusa);

    }
}
