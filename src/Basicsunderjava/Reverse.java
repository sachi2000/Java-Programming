package Basicsunderjava;

public class Reverse {

	public static void main(String[] args) {
		int l;
		// TODO Auto-generated method stub
		String r = "SACHIN";
		String r2 ="";
		l=r.length();
		System.out.println(l=r.length());
		int i;
		for(i=l-1;i>=0;i--)
		{
			r2=r2+r.charAt(i);
		}
		
		System.out.println(r2);
		}

}
