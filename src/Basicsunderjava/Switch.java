package Basicsunderjava;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the values");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//int a=3 ,b=4,c=5;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a  is greater="+a);
			}
		}
		else if(b>c)
		{
			System.out.println("b is greater="+b);
		}
		else
		{
			System.out.println("c is greater="+c);
		}
		


	}

}
