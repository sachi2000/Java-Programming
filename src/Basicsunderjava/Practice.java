package Basicsunderjava;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice s =new Practice();
		s.logic();
		
	}
	void logic()
	{
		System.out.println("enter the values");
		Scanner sc= new Scanner(System.in);
			int x=sc.nextInt();
			int y=sc.nextInt();
		
		int c;
		if(x>y)
		{
			c=x+y;
		}
		else
		{
			c=(x+y)*5;
		}
		
		System.out.println("output is"+c);
	}

}
