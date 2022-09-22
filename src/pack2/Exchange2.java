package pack2;

import pack1.Exchange;

public class Exchange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exchange obj=new Exchange();
		int total=obj.Add(40,20);
		int difference=obj.sub(30,20);
		int multiplication=obj.mul(3,3);
		int Modulation=obj.modd(10,3);
		System.out.println("Addition is "+total);
		System.out.println("Difference is "+difference);
		System.out.println("Multiplication is "+multiplication);
		obj.div(60,10);
		System.out.println("Modulation is "+Modulation);
		
	}

}
