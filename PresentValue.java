import java.util.Scanner;
import java.lang.Math;

public class PresentValue
{
	public static void main(String[] args){

	Scanner input=new Scanner(System.in);
	System.out.println("please enter the future value");
	double futureVal=input.nextDouble();

	System.out.println("please enter the number of years");
	int time=input.nextInt();

	System.out.println("please enter the annual interest rate");
	double interestRate=input.nextDouble();


	double presentVal = futureVal / Math.pow((1 + interestRate), time);
	// p=f/Math.pow((1 + r), n);
	System.out.println("You need to deposit today $ "+ presentVal );

	}

}






