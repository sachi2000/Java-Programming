package javaprogram;
class Throw
{
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not valid");	 // If the input is less than 18 it shoes java.lang.ArithmeticException: not valid
			
		}
		else 
		{
			System.out.print("Eligible for Driving License ");
		}
	}
}

public class ThrowExample extends Throw{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(17);
	}

}
