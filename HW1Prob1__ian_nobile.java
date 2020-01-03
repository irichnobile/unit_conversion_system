//********************************************************************************
//	HW1Prob1__ian_nobile.java		Author: Ian Nobile
//
//	Performs three conversions to the metric system (inches->centimetres, gallons to 
//	litres and pounds to kilogrammes.). Results displayed with appropriate explanation 
//	and formatted to three decimal places.
//********************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class HW1Prob1__ian_nobile
{
	//----------------------------------------------------------------------------
	//	The Unit Conversion System
	//----------------------------------------------------------------------------
	public static void main(String[] args) 
	{
		//variables, including some constant values
		final double dInToCm = 2.54;
		final double dGalToL = 3.7854;
		final double dLbtoKg = 0.453592;
		double dInches = 0;
		double dGallons = 0;
		double dLbs = 0;
		double dCentimetres = 0;
		double dLitres = 0;
		double dKilogrammes = 0;
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.###");

		System.out.println("Hello, and welcome to the Unit Conversion System.");
		System.out.print("Please enter a value in inches: ");
		dInches = scan.nextDouble();
		dCentimetres = dInches * dInToCm;
		System.out.print("Thank you. And now a value in gallons: ");
		dGallons = scan.nextDouble();
		dLitres = dGallons * dGalToL;
		System.out.print("One more. A value in pounds, if you please. ");
		dLbs = scan.nextDouble();
		dKilogrammes = dLbs * dLbtoKg;
		System.out.print("\nAll right, " + dInches + " inches is " + fmt.format(dCentimetres) + " centimetres, ");
		System.out.print(dGallons + " gallons is " + fmt.format(dLitres) + " litres, ");
		System.out.println("and " + dLbs + " pounds is " + fmt.format(dKilogrammes) + " kilogrammes.");
		System.out.println("\nThank you for using the UCS!\nGoodbye!");
		scan.close();
		
	} //end void

	
} //end class

