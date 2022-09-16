package javaprogram;


public class EdUsingConstructor {
	int id;
	int salary;
	String name,designation;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdUsingConstructor Emp1=new EdUsingConstructor(12,"ashok","Manager",100000);
		EdUsingConstructor Emp2=new EdUsingConstructor(13,"Abhi","developer",80000);
		EdUsingConstructor Emp3=new EdUsingConstructor(14,"swapna","tester",20000);
		Emp1.display();
		Emp2.display();
		Emp3.display();

	}
EdUsingConstructor( int id_temp,String name_temp,String designation_temp,int salary_temp)
{
	id=id_temp;
	name=name_temp;
	designation=designation_temp;
	salary=salary_temp;
}
void display()
{
	System.out.println("\nEmployment id is "+id);
	System.out.println("Employment Name is "+name);
	System.out.println("Employment Designation is "+designation);
	System.out.println("Employment salary "+salary);
}
	
}
