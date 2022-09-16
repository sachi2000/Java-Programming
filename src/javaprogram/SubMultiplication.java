package javaprogram;


public class SubMultiplication {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		SubMultiplication o=new SubMultiplication();
		o.sub(50,30);
		o.sub(100.22,50.22);
		o.sub(100,40,20);
		o.mul(2,3);
		o.mul(2.21f,3.21f);
		o.mul(2,3,2);
		
		
	}
void sub(int x,int y)
{
	
		int diff=x-y;
		System.out.println("Subtraction of 2 input is: "+diff);
	
}
void sub(double x,double y)
{
	
		double diff=x-y;
		System.out.println("Subtraction of 2 input is: "+diff);
	
}
void sub(int x,int y,int z)
{
	
		int diff=x-y-z;
		System.out.println("Subtraction of 3 input is: "+diff);

	
}
void mul(int x,int y)
{
	
		int product=x*y;
		System.out.println("\nMultiplication of 2 input is: "+product);
	
}
void mul(float x,float y)
{
	
		float product=x*y;
		System.out.println("Multiplication of 2 input is: "+product);
	
}
void mul(int x,int y,int z)
{
	
		int product=x*y*z;
		System.out.println("Multiplication of 3 input is: "+product);

		

	}

}
