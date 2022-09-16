package javaprogram;
interface java

{
	void j();
}
interface java2
{
	void j2();
	
}


public class MultipleInterface implements java,java2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInterface obj=new MultipleInterface();
		obj.j();
		obj.j2();

		
	}
	public void j()
	{
		System.out.println("Who is taking the Java course for Automation Testing Batch ?");
	}
	public void j2()
	{
		System.out.println("Ashok Reddy :)");
	}
		
	
}
