package ssg;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add obj1=new Add();
		obj1.multi(5,6);
		obj1.div(10,2);
		int total=obj1.add(10,20);
		int difference=obj1.sub(30,10);
		System.out.println("Sum is"+total);
		System.out.println("subtration is"+difference);
	}
	int add(int x ,int y)
	
	{
		int sum=x+y;
		return(sum);
	
		
	}
	int sub(int x ,int y)
	{
		int diff=x-y;
		return(diff);
	}
	void multi(int x,int y)
	{
		int mul=x*y;
		System.out.println("multiplication is"+mul);
		
		
	}
	void div(int x,int y)
	{
		int div=x/y;
		System.out.println("division is"+div);
		
		
	}
	
	
	
	

}
