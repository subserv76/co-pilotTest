
// write a program that will ask the user for the number of miles driven and the gallons of gas used. It should calculate the miles per gallon and display the result.

import java.util.Scanner;

public class CoPilotDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double miles;
        double gallons;
        double mpg;

        System.out.print("Enter the number of miles driven: ");
        miles = input.nextDouble();

        System.out.print("Enter the number of gallons of gas used: ");
        gallons = input.nextDouble();

        mpg = miles / gallons;

        System.out.println("The miles per gallon is: " + mpg);

        input.close();
    }
}