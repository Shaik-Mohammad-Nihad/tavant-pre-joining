package day1;
import java.util.Scanner;
import java.io.*;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		
		System.out.println("enter value for celsius");
		Double celsius=c.nextDouble();
		System.out.println(convertToFarenheit(celsius));
		System.out.println("enter value for farenheit");

		Double farenheit=c.nextDouble();

		    
		
		System.out.println(convertToCelsius(farenheit));
		
		 }
	static double convertToFarenheit(Double celsius)
	{
		 return ((9.0 / 5) * celsius + 32 );
		

	}
	static double convertToCelsius (Double farenheit)
	{
		 return ((farenheit - 32 )* (5 / 9.0));
		

	}

}
