package Chapter_2;
import java.util.Scanner;

/**
 * This program prints a pair of initials.
 */
public class Initials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get the names of the couple
        System.out.print("Enter your first name: ");
        String first = in.next();
        System.out.print("Enter your significant other's first name: ");
        String second = in.next();

        // Compute and display the inscription
        String initials = first.charAt(0) + "&" + second.charAt(0);
        System.out.println(initials);
    }
}