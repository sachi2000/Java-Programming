package pack1;
class A
{
    private void a()//scope of this within the class
	{
		System.out.println("Life is full of Automation ");
	}
	void b()
	{
		System.out.println("Life is full of Jira ");
	}
	
	
	
}
public class PrivateExample extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateExample Obj= new PrivateExample();
		//Obj.a(); // The method a from the class A is not visible
		Obj.b();
		Obj.e();//inside the class so it provides the output
	
		
		

	}
	
	 private void e()//scope of this within the class
		{
			System.out.println("Java Course is taking by Ashok reddy  ");
		}
	
	

}
