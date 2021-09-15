package Chapter_2;

/**
 * This program converts the dimensions of a letter-sized sheet of paper from inches to millimeters.
 */
public class Exercise1 {
    public static void main(String[] args) {
        final double MM_PER_IN = 25.4; // Sets amount of millimeters in one inch.

        // Original page length and width, in inches, along with print of init values.
        double pageLength = 8.5;
        double pageWidth = 11;
        System.out.printf("The initial page dimensions, in inches, are: %15.1f x %.1f in.\n", pageLength, pageWidth);

        // Calculate conversion
        pageLength = pageLength * MM_PER_IN;
        pageWidth = pageWidth * MM_PER_IN;

        // Print results
        System.out.printf("The page dimensions, converted to millimeters, are: %15.2f x %.2f mm.\n", pageLength, pageWidth);
    }
}
