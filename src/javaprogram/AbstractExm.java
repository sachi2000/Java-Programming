package javaprogram;
abstract class Engineer
{
    abstract void  pk();
    void pk1()
    {
    	System.out.println("Its Sep 15 ");
    }
    
}

public class AbstractExm extends Engineer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExm obj=new AbstractExm();
		obj.pk1();
		obj.pk();
			

	}
	void pk()
	{
		System.out.println("Happy Engineers Day :) ");
	}
	

}
