package OOPConcepts;

public class Starter {
	
	public static void main(String[] args) {

		Employee emp1= new Employee(101,"Tom Smith",35,'M',10456.58);
		Employee emp2= new Employee(102,"Sheena Anderson",35,'F',12456.0);
		
		
		
	    Employee1 emp3= new Employee1(102,"Sheena Anderson",35,'F',12456.0);
	     
	      emp3.createAddress();
	      emp3.display();
	      
//	      emp1.display();
	      
	      System.out.println("Net salary for this employee : "+emp1.calculate(1000));
	      System.out.println();
	  	  System.out.println();
//	      
//	  	  emp2.createAddress();
	      emp2.display();
	      System.out.println("Net salary for this employee : "+emp2.calculate(1200));
	      System.out.println();
	  	  System.out.println();
		
	      emp1.deptName("accounts");
			
	  	//Making Student Objects
			
	  			Student stud1 = new Student(101,"Mike Miller",25,'M',23.43,34.5,343.0);
	  	        stud1.display();
	  	    
	  	       
	  	        
	  	       double avg=stud1.calculate(3);
	  	       
   	          System.out.println(stud1.gradYear(2022));
	  	      System.out.println("Average Score : "+String.format("%.3f", avg));

       
		
		
		
        
   
      
      
	}

}
