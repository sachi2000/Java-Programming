package Basicsunderjava;
import java.util.*;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Sachin";
		String b="Sachin";
		String c=a+b;
		String str=a.substring(2);//substring function to find the substring of the  given string a="sachin"
		int i;
		String d[]= {"I","D","B","M","F"};
		 Arrays.sort(d); // used to sort the given string input d[]= {"I","D","B","M","F"}
		 String r ="";
		 int x=a.length();	// length function to find the length of the string a="sachin"
			//Reversing a string a="Sachin"
			for(i=x-1;i>=0;i--)
			{
				r=r+a.charAt(i);
			}
			System.out.print("The Reverse of the given string is :");
			System.out.println(r);
			
			//checking two strings are equal
			
			if(a==b)
		{
			System.out.println("\n\nTwo strings are equal");
		}
		else
		{
			System.out.println("Two strings are equal");
		}
	   
		//output of concatenation of the string a="sachin "	
		System.out.print("\n\nconcatenation of input is: ");
		System.out.println(c);
		
		// output of length of the string a="sachin "
		System.out.print("\n\nlength of the  input is: ");
		System.out.println(x);
		
		// output of substring of the string a="sachin"
		System.out.print("\n\nSub string of the input is: ");
		System.out.println(str);
		
		// output of ascending order of a string d[]= {"I","D","B","M","F"}
		System.out.print("\n\nSorted in ascending order: ");
		System.out.print(Arrays.toString(d));
		
		
	
		

	}

}
