package Basicsunderjava;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function obj=new Function();
		int total=obj.Add(40,40);
		int difference=obj.sub(30,20);
		int multiplication=obj.mul(2,3);
		System.out.println("Multiplication is "+multiplication);
		System.out.println("Difference is "+difference);
		System.out.println("Division is  "+total);
		obj.div(60,20);
		int output=obj.modd(10,3);
		System.out.println("Modulation is "+output);
		
		
		
		
	}
	int Add(int x,int y)
	{
		int sum=x+y;
		return(sum);
	}
	int sub(int x,int y)
	{
		int div=x-y;
		return(div);
	}
	int mul(int x, int y)
	{
		int multi;
		multi=x*y;
		return(multi);
	}
	void div(int x,int y)
	{
		int divi=x/y;
		System.out.println("divison is"+divi);
		
	}
	int modd(int x,int y)
	{
		int mod=x%y;
		return(mod);
		
	}

}
