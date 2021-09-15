package Chapter_2;
import javax.swing.JOptionPane;

/**
 * This program prompts for a measurement in meters and then converts it to miles, feet, and inches.
 */
public class Exercise6 {
    public static void main(String[] args) {
        // Prompt for init number
        double meters = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the " +
                "measurement in meters."));

        // Assign static variables.
        final double MILES_PER_METER = 0.000621371;
        final double FEET_PER_METER = 3.28084;
        final double INCHES_PER_METER = 39.3701;

        // Perform conversion calculations
        double miles = meters * MILES_PER_METER;
        double feet = meters * FEET_PER_METER;
        double inches = meters * INCHES_PER_METER;

        // Print results
        JOptionPane.showMessageDialog(null, "Meters:   "+meters+"\nMiles:    "+miles+"\nFeet:     "+feet+"\nInches:   "+inches+"\n");
    }
}
