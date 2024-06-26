/* PayCheck.java
* Dylan Temple
* 1609700
* CMPS12A Programming Assignment 1 
* This program calculates the amount of pay a salaried employee receives given the number of hours they worked and their hourly wage. */

import java.util.Scanner;

public class PayCheck {

	private static Scanner scan;

	public static void main(String[] args) {
		double hoursWorked = 0;
		double payRate = 0;
		double payCheck = 0;
		scan = new Scanner(System.in);
		System.out.println("Please enter the total hours worked Monday through Sunday.");
		hoursWorked = scan.nextInt();
		System.out.println("Please enter your pay rate (in terms of dollars per hour).");
		payRate = scan.nextInt();
		payCheck = (hoursWorked > 40) ? (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5) : hoursWorked * payRate;
		System.out.println("Your paycheck for this week is: " + payCheck);
	}

}
