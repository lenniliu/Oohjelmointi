package Teht1_2;

import java.util.Scanner;
public class convertor {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Anna lämpöaste Fahrenheiteissa: ");
        double temp = Double.parseDouble(reader.nextLine());

        double conversion = (temp - 32) / 1.8;

        System.out.printf("Conversion to celsius would loo like this; %6.1f\n", conversion);
    }
}
