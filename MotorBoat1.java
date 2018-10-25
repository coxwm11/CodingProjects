//Program: MotorBoat1
//Purpose: Class for MotorBoat1
//Author:Wendy Prayer
//Date: 10/16/2018

package motorBoat1;

public class MotorBoat1 {

	private double fuelTank;
	private double currentSpeed;
	private double distanceTraveled;
	


public MotorBoat1()
{
	fuelTank = 0;
	currentSpeed = 0;
	distanceTraveled = 0;

}


public MotorBoat1(double a, double b, double c) 
{
	fuelTank = a;
	currentSpeed = b;
	distanceTraveled = c;
}

public double getFuelTank()
{
		return fuelTank;


}




public double getCurrentSpeed()
{
		return currentSpeed;


}

public double getDistanceTraveled()
{
		return distanceTraveled;


}

public void getFuelTank(double a)
{
		 fuelTank = a;


}

public void getCurrentSpeed(double b)
{
		currentSpeed = b;


}

public void getDistanceTraveled(double c)
{
		distanceTraveled = c;


}



public String toString()

{
	return ("(" + fuelTank + ", " + currentSpeed + " , " + distanceTraveled + ") ");

}





}