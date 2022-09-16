package javaprogram;

public class EmpDetails {
	int id;
	int salary;
	String name,designation;
	static String CompanyName="TietoEvry";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpDetails Emp1=new EmpDetails();
		Emp1.init(12,"ashok","Manager",100000);
		Emp1.display();		
		Emp1.init(12,"sachin","Analyst",50000);
		Emp1.display();
		EmpDetails Emp2=new EmpDetails();
		Emp2.init(13,"Abhi","developer",80000);
		Emp2.display();
		EmpDetails Emp3=new EmpDetails();
		Emp3.init(14,"swapna","tester",20000);
		Emp3.display();
		
		

	}
void init( int id_temp,String name_temp,String designation_temp,int salary_temp)
{
	id=id_temp;
	name=name_temp;
	designation=designation_temp;
	salary=salary_temp;
}
void display()
{
	System.out.println("\nEmployment Company is "+CompanyName);
	System.out.println("Employment id is "+id);
	System.out.println("Employment Name is "+name);
	System.out.println("Employment Designation is "+designation);
	System.out.println("Employment salary is "+salary);
	
}

}
