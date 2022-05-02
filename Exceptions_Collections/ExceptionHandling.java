package demo;


public class ExceptionHandling {

	public static void main(String[] args) {
		String str="This is my string";
		String name=null;
		 
		try {
			
		   for(int i=0; i<=str.length(); i++)
		   {
			System.out.println(str.charAt(i));
		   }
		   
	   }// end of try block
		
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println("exception occured "+ex.getMessage());
		}
	
		 System.out.println("the length of the name is : "+name.length());
		
		try {
		System.out.println("the length of the name is : "+name.length());
		}
		
		catch(NullPointerException npex)
		{
			System.out.println(npex.getMessage());
		}
        finally
		{
			System.out.println("hello");
			
		}
		System.out.println("just finished printing my string");
		
		
	}

}
