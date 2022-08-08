package Exception;

public class ArithmeticExceptionDemo {
	 public static void main(String[]args)
	  {
		  int a=20,b=0,c=0;
		  
		  try
		  {
			   c=a/b;
			   
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Can't divide by zero");
		  }
		  System.out.println(c);
		  
		  
	  }

}
