package day1;
import java.io.*;
import java.util.Scanner;
public class Factorial {
	  static int calculateFactorial(int num)
	 {
		  int sum=1;
		 for(int i=1;i<=num;i++)
		 {
			  sum=sum*i;
		 }
		 
		return sum;
	 }

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 Scanner b=new Scanner(System.in);
		 int num=b.nextInt();
		 System.out.println(calculateFactorial(num));

	}

}
