package Chapter_2;
import java.util.Scanner;

/**
 * This program simulates a vending machine that accepts bill and quarters, and gives change.
 */
public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;

        System.out.print("Enter value of inserted money in dollars (1 = $1, 5.25 = $5.25, etc.): ");
        double cashValue = in.nextDouble();
        System.out.print("Enter item price in dollars: ");
        double itemPrice = in.nextDouble();

        // Compute change due
        double changeDue = PENNIES_PER_DOLLAR * cashValue - itemPrice * PENNIES_PER_DOLLAR;
        int dollarsDue = (int)Math.floor(changeDue) / PENNIES_PER_DOLLAR;
        double quartersDue = changeDue % PENNIES_PER_DOLLAR;
        double quarters = quartersDue / PENNIES_PER_QUARTER;

        // Print change due
        System.out.printf("Dollar coins: %6d", dollarsDue);
        System.out.println();
        System.out.printf("Quarters: %13.2f", quarters);
        System.out.println();
    }
}
