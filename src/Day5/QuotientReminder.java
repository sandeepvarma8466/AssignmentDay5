package Day5;

import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener Dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter Divisor: ");
        int divisor = sc.nextInt();
        int quotient = dividend / divisor;
        int reminder = dividend % divisor;
        System.out.println("Quotient = " +quotient+ "  Reminder = " +reminder);
    }
}
