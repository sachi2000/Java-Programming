package pack1;
class C
{
     protected void c() //within and without class ,package can be called but using Inheritance concept
	{
		System.out.println("Life is full of Automation ");
	}
	void d() //Default - within and without class but should be there inside the package
	{
		System.out.println("Life is full of Jira ");
	}
}
	

public class DefProtected extends C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefProtected Obj1= new DefProtected();
		Obj1.c(); 
		Obj1.d();
	}
}

	




