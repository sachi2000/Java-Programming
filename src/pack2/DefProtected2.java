package pack2;
import pack1.*;

public class DefProtected2 extends DefProtected {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		DefProtected2 obj=new DefProtected2();
		obj.c();  // It is protected in pack 1 so it provide the output
	   //obj.d(); //  Doesnt show output Because it is default in pack1

	}

}
