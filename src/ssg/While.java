package ssg;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//System.out.println("enter the value");
		//Scanner sc= new Scanner(System.in);
		//int number=sc.nextInt();
		
		int fact=1, i=1;
		int number=0;
		
			
		do
		{
			fact=fact*i;
			i++;
		}while(i<=number);
	
		System.out.println("Factorial of the given number is "+fact);
	}

}
