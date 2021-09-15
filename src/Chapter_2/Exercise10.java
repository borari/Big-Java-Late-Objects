package Chapter_2;
import javax.swing.JOptionPane;

/**
 * This program computes the total cost of owning a new ICE/hybrid vehicle in regard to purchase price and refueling
 * costs, over an arbitrary amount of years, while considering the resale value of the vehicle at the end of the period
 * of ownership.
 */
public class Exercise10 {
    public static void main(String[] args) {
        // Prompt user for initial values
        double purchasePrice = Double.parseDouble(JOptionPane.showInputDialog(null, "How much will " +
                "purchasing this vehicle cost?"));
        double yearsOwned = Double.parseDouble(JOptionPane.showInputDialog(null, "How many years " +
                "are you planning to own this vehicle?"));
        double annualMileage = Double.parseDouble(JOptionPane.showInputDialog(null, "How many " +
                "miles will you drive this vehicle per year?"));
        double fuelPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the " +
                "current price per gallon (or kWh) of fuel for this vehicle?")); // This allows for mpg or mpkWh.
        double fuelEfficiency = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the " +
                "published fuel efficiency of this vehicle?"));
        double resaleValue = Double.parseDouble(JOptionPane.showInputDialog(null, "How much do you " +
                "expect to receive when selling this vehicle after " +yearsOwned+" years?"));

        // Perform calculations
        double annualFuel = annualMileage * fuelEfficiency; // The amt of fuel needed per year of ownership.
        double annualFuelCost = annualFuel * fuelPrice; // Cost of fuel per year
        double totalFuelCost = annualFuelCost * yearsOwned; // Cost of fuel over ownership life
        double realPurchasePrice = purchasePrice - resaleValue; // Amount regained from purchase price after selling vehicle.
        double totalCostOfOwnership = realPurchasePrice + totalFuelCost;

        // Print results
        JOptionPane.showMessageDialog(null, "The total cost of ownership of this vehicle over " +
                yearsOwned + " years is:\n    $" + totalCostOfOwnership + ".\n");

    }
}
