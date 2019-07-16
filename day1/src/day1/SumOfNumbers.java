package day1;
import java.io.*;
import java.util.Scanner;
public class SumOfNumbers {
	static int sumOfOddNumbers(int start, int end)
	{
		int i,sum=0;
		for(i=start;i<=end;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	static int sumOfEvenNumbers(int start, int end)
	{
		int i,s=0;
		for(i=start;i<=end;++i)
		{
			if(i%2==0)
			{
				s=s+i;
			}
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int start,end;
Scanner b=new Scanner(System.in);
start=b.nextInt();
end=b.nextInt();
System.out.println("sum of odd numbers="+sumOfOddNumbers(start,end));
System.out.println("sum of even numbers="+sumOfEvenNumbers(start,end));
	}

}
