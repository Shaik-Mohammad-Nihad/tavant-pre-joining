package day1;
import java.io.*;
import java.util.Scanner;

public class MarkValidator {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		System.out.println("enter marks for validation");
		int mark=b.nextInt();
		System.out.println("student is pass:"+isPass(mark));
			markGrade(mark);
		
		// TODO Auto-generated method stub

	}
	static boolean isPass(int mark)
	{
		if(mark>=40)
			return true;
		
		else
			return false;
		
	}
static void markGrade(int mark)
{
	if(isPass(mark)==true)
	{
        if(mark>90)
        	System.out.println("Grade A");
        else if(mark>75&&mark<=90)
        	System.out.println("Grade B");
        else if(mark>60&&mark<=75)
        	System.out.println("Grade c");
        else
            	System.out.println("Grade D");
}
}
}
