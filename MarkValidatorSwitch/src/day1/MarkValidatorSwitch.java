package day1;

import java.util.Scanner;

public class MarkValidatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b=new Scanner(System.in);
		System.out.println("enter marks for validation");
		int mark=b.nextInt();
		System.out.println("student is pass:"+isPass(mark));
			markGrade(mark);
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
		switch(mark)
		{
			case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93:
			case 92: case 91:
				System.out.println("Grade A");
				break;
			case 90: case 89: case 88: case 87: case 86: case 85: case 84: case 83:
			case 82: case 81: case 80: case 79: case 78: case 77: case 76:
				System.out.println("Grade B");
				break;
			case 75: case 74: case 73: case 72: case 71: case 70: case 69: case 68:
			case 67: case 66: case 65: case 64: case 63: case 62: case 61:
				System.out.println("Grade C");
				break;
			default:
				System.out.println("Grade D");
		}
	}
}
}


