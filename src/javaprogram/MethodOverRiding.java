package javaprogram;
 class Engineers //super class
{
	  void pk()
	{
		System.out.println("Its Sep 15 ");
	}
}

public class MethodOverRiding extends Engineers{    //sub class

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MethodOverRiding obj=new MethodOverRiding();
		obj.pk(); // call the subclass method
				

	}

	void pk()
	{
	    super.pk(); //To call the method in the super class
		System.out.println("Happy Engineers Day :)");
	}
	

}
