package Chapter_2;

/**
 * This program computes and displays the perimeter of a letter-size sheet of paper and the length of its diagonal.
 */
public class Exercise2 {
    public static void main(String[] args) {
        // Set init page size
        double pageLength = 8.5;
        double pageWidth = 11;

        // Calculate perimeter & diagonal
        double pagePerimeter = 2 * (pageLength + pageWidth);
        // d = sqrt(w^2+l^2)
        double pageDiagonal = Math.sqrt(pageWidth * pageWidth + pageLength * pageLength);

        // Print results
        System.out.printf("The perimeter of the page is: %6.1f. The diagonal length of the page is: %6.1f.\n", pagePerimeter, pageDiagonal);
    }
}
