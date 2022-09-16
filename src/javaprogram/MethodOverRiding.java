package javaprogram;
 class Bird //super class
{
	  void bird()
	{
		System.out.println("Which is our National Bird ? ");
	}
}

public class MethodOverRiding extends Bird{    //sub class

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MethodOverRiding obj=new MethodOverRiding();
		obj.bird(); // call the subclass method
				

	}

	void bird()
	{
	    super.bird(); //To call the method in the super class
		System.out.println("PEACOCK");
	}
	

}
