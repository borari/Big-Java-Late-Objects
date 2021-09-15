package Chapter_2;
import javax.swing.JOptionPane;

/**
 * This program prompts the user for the amount of fuel left in a vehicle, the fuel efficiency of the vehicle, and how
 * many miles they will be driving, then prints the total cost for the trip as well as the distance the vehicle can
 * travel before its next refueling.
 */
public class Exercise11 {
    public static void main(String[] args) {
        // Prompt for init values
        double tripLength = Double.parseDouble(JOptionPane.showInputDialog(null, "How many miles " +
                "will you be driving in total?"));
        double currentFuel = Double.parseDouble(JOptionPane.showInputDialog(null, " How much fuel " +
                "is left in the vehicle now?"));
        double fuelEfficiency = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the " +
                "published fuel efficiency of your vehicle?"));
        double fuelCost = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the current " +
                "cost per unit of fuel for your vehicle?"));

        // Perform calculations
        double fuelUsed = tripLength / fuelEfficiency;
        double tripFuelCost = fuelUsed * fuelCost;
        double currentRange = currentFuel * fuelEfficiency;

        // Print Results
        JOptionPane.showMessageDialog(null, "Your current available range is:\n    " + currentRange +
                "\nThe total cost to drive " + tripLength + " miles in this vehicle is:\n    $" + tripFuelCost);
    }
}
