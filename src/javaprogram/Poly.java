package javaprogram;

public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly obj1=new Poly();
		obj1.add(20,30);
		obj1.add(20.2f,30.4f);
		obj1.add(20,30,40);
		
	}
void add(int x,int y)
{
	
		int sum=x+y;
		System.out.println("Sum of 2 input is: "+sum);
	
}
void add(float x,float y)
{
	
		float sum=x+y;
		System.out.println("Sum of 2 input is: "+sum);
	
}
void add(int x,int y,int z)
{
	
		int sum=x+y+z;
		System.out.println("Sum of 3 input is: "+sum);
	
}


}
