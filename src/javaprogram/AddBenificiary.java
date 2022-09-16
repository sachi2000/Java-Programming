package javaprogram;
class Login
{
	void verifylogin()
	{
		System.out.println("1st step is login Process");
		}
}

public class AddBenificiary extends Login{

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		AddBenificiary obj=new AddBenificiary();
		obj.verifylogin();
		obj.verifyaddbenificiary();
		

	}
	void verifyaddbenificiary()
	{
		System.out.println("2nd Step is to add all the Benificiary details");
	}

}
