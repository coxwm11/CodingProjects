//Program: MotorBoat1.java
//Purpose: Calculates gallons remaining, time traveled, and re-fuel amount needed
//Author:Wendy Prayer
//Date: 10/16/2018


package motorBoat1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TestMotorBoat1 {

	public static void main(String[] args) {
		
		DecimalFormat df1 = new DecimalFormat("0.##");
		
		
		//Constants for Fuel Capacity, Max Speed and Motor Efficiency
		final  int  FUEL_CAPACITY = 50;//gallons
		final  int MAX_SPEED = 90;//mph
		final double MOTOR_EFFICIENCY = 0.43;
		double minutesTraveled;
		double currentRemainingFuel;
		double remainingFuel;
		double totalFuel;
		double userChoice1;
		double userChoice2;
		double userChoice3;
		
		//ComputerInput
		System.out.println("Enter your current fuel (gallons): ");
		Scanner scan = new Scanner (System.in);
		userChoice1 = scan.nextDouble();
		
		System.out.println("Enter your current speed (mph): ");
		userChoice2 = scan.nextDouble();
		
	
		System.out.println("Enter your current distance traveled (miles): ");
		userChoice3 = scan.nextDouble();
		
		//MotorBoat1 takes input from user for: Fuel Capacity, Current Speed, and Distance Traveled
		MotorBoat1 m1 = new MotorBoat1(userChoice1, userChoice2, userChoice3);
				
		
		//variables for formulas and calculations
		minutesTraveled = (m1.getDistanceTraveled()/ m1.getCurrentSpeed());
		currentRemainingFuel = (m1.getFuelTank() - (m1.getDistanceTraveled() * MOTOR_EFFICIENCY));
		remainingFuel = FUEL_CAPACITY - currentRemainingFuel;
		totalFuel = currentRemainingFuel + remainingFuel;
		
		
		
		
		
		
		//Heading for Testing
		System.out.println("Testing the MotorBoat1 Class");
		System.out.println("----------------------------");
		
		

		//Prints message if exceeding tank capacity or maximum speed
		if(userChoice1 > FUEL_CAPACITY | userChoice2 > MAX_SPEED) {
		
		System.out.println("Exceeded Fuel Capacity of 50 gallons and/or Maximum Speed of 90 mph.");
		
		System.out.println(" ");
		}
		
		

		//Prints message if no violations of Maximum Speed and Tank Capacity
		 else if (userChoice1 <= FUEL_CAPACITY && userChoice2 <= MAX_SPEED) {
		
		System.out.println(" ");
		System.out.println("My boat has "+ df1.format(m1.getFuelTank() ) + " gallons in its tank.");

		System.out.println("We are traveling at "+ m1.getCurrentSpeed()  + " miles per hour.");
		
		System.out.println(" ");
		
		System.out.println("After traveling for "+ df1.format((minutesTraveled * 60))   + " minutes, there are " + df1.format(currentRemainingFuel) + " gallons in the tank.");
	
		System.out.println("And we have traveled " + m1.getDistanceTraveled() + " miles. ");
		
		System.out.println("We will refuel if we have less than 10 gallons remaining. ");
		
			
		System.out.println(" ");}
		
	
	
		// Refuel Message Warning
		if (currentRemainingFuel < 10) {
	
		System.out.println("ATTENTION:You have less than 10 gallons of fuel remaining. We are ready to go back and refuel.");
	
		System.out.println("Let's get "+  df1.format((remainingFuel))  + " more gallons." );
	
		System.out.println("After refueling, we will have "+ (currentRemainingFuel + remainingFuel)   + " gallons in the tank.");}
		
	
		
		
		
		
	}
	
	}
	

