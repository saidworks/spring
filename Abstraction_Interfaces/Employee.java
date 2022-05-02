package OOPConcepts;

 public class Employee extends Person implements PersonInterface, PersonInterface1{
  int emp_id;
  double emp_salary;
  
  
  Employee()
  {
	  
  }
  
  
  Employee(int emp_id, String name,int age, char gender,double emp_salary)
  {
	 super(name,age,gender);
	 
	 this.emp_id=emp_id;
	 this.emp_salary=emp_salary;
	 
	
  }
  


public void display()
{
	System.out.println(ORGINIZATION);
	System.out.println("-------------");
	
	System.out.println("Id : "+this.emp_id);
	super.display();
	System.out.println("Salary : "+this.emp_salary);
	System.out.println();
	
}


public String deptName(String name)
{
	return name;
}



public double calculate(int bonus) {
	double  netsalary= bonus+ this.emp_salary;
	return netsalary;
}



public int compute(int num1, int num2)
{
	int time= num2-num1;
	return time;
}



void calculate(double n1, double n2)
{
	System.out.println(n1+n2);
}
  
}
