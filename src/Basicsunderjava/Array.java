package Basicsunderjava;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,len;
          int  x[]= {3,6,4,1,2};
          len= x.length;
     
          Arrays.sort(x);
          System.out.println( "numbers  are in decending order" );
          for(i= len-1;i>=0;i--)
          
          {
        	  System.out.print(x[i]+" ");
          }
         
          System.out.println( "\n\nnumbers  are in ascending order" );
          for(i=0;i<=len-1;i++)
          {
        	  System.out.print(x[i]+" ");
          }
          System.out.println( "\n\nLength of the array is "+len );
          
	}

}
