package Basicsunderjava;
 
public class Practice2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=5,i;
	boolean flag=false;
	
	for(i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			flag=true;
			
		}
	}
	if(!flag)
	{
		System.out.println( +n + "  is a prime number ");
	}
	else
	{
		System.out.println( +n + "  is not a prime number ");
	}

	}

}
