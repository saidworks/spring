package OOPConcepts;


public class Student extends Person implements PersonInterface,StudentGrad{
	int stud_id;
	double subject1,subject2,subject3;
	String major;
	
	Student(int id, String name,int age, char gender,double s1,double s2,double s3)
	  {
		
		  super(name,age,gender);
		  
		  this.stud_id=id;
		  this.subject1=s1;
		  this.subject2=s2;
		  this.subject3=s3;
		  
	  }
	  
	
	public void Hello()
	    {
	    	System.out.println("Good Morning!!");
	    }
     
	 
	public void display()
	{
		System.out.println(ORGINIZATION);
		System.out.println("Id : "+this.stud_id);
		super.display();
		System.out.println(this.pname);
		System.out.println("Subject1 score : "+this.subject1);
		System.out.println("Subject2 score : "+this.subject2);
		System.out.println("Subject3 score : "+this.subject3);
		
		System.out.println();
		System.out.println();
		
//		System.out.println(String.format("%.3f",calculate(3)));
//		System.out.println();
//		System.out.println(super.calculate(3));
		
		
	}

	
	public int compute(int i, int j)
	{
		return i/j;
	}
	
	

	public double calculate(int totalSubjects) {
		System.out.println("calculate() inside child class");
		double  average= ((this.subject1+this.subject2+this.subject3)/totalSubjects);
		return average;
	}
	
	
	public int gradYear(int year)
	{
		
		return year;
	}
	
}//closing class 'Student'
	
	

