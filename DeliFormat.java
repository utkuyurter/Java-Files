// ************************************************************
// DeliFormat.java         Author: Utku Yurter
//
// Description: Computes the price of a deli item given the weight
// (in ounces) and price per pound -- prints a label,
// nicely formatted, for the item.
//
// ************************************************************
import java.util.Scanner;
import java.text.* ;
public class DeliFormat
{
    // ---------------------------------------------------
    // main reads in the price per pound of a deli item
    // and number of ounces of a deli item then computes
    // the total price and prints a "label" for the item
    // ---------------------------------------------------
    public static void main (String[] args)
    {
        final double OUNCES_PER_POUND = 16.0;
        double pricePerPound; // price per pound
        double weightOunces; // weight in ounces
        double weight; // weight in pounds
        double totalPrice; // total price for the item
        Scanner scan = new Scanner(System.in);
        
        // Declare money as a NumberFormat object and use the
        // getCurrencyInstance method to assign it a value
        NumberFormat money = NumberFormat.getCurrencyInstance() ;
        
        // Declare fmt as a DecimalFormat object and instantiate
        DecimalFormat fmt = new DecimalFormat("0.##") ;
        // it to format numbers with at least one digit to the left of the
        // decimal and the fractional part rounded to two digits.
        // prompt the user and read in each input
        
        
        System. out. println ("Welcome to the CS Deli! ! \n ");
        System.out.print ("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();
        System.out.print ("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();
        // Convert ounces to pounds and compute the total price
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;
        // Print the label using the formatting objects
        
        System.out.println("\n*****CS DELI*****");
        System.out.println("\nUnit Price: " + money.format(pricePerPound));
        System.out.println("Weight: " + fmt.format(weight));
        System.out.println("\nTOTAL: " + money.format(totalPrice));
        // fmt for the weight in pounds and money for the prices
    }
}
