package Exception;

public class ExceptionDemo
{
	
  public static void main(String[]args)
  {
	  int a=20,b=0,c;
	  
	  try
	  {
		   c=a/b;
		   System.out.println(c);
	  }
	  catch(Exception e)
	  {
		  System.out.println("Can't divide by zero");
	  }
	  
	  
  }
    
}
