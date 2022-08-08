package Exception;

public class ArrayIndexOutOfBoundsExceptionDemo 
{
	public static void main(String[]args)
	  {
		  int a=20,b=4,c=0;
		  int x[]=new int[5];
		  
		  try
		  {
			   c=a/b;
			   for(int z=0;z<=5;z++)
			   {
				   x[z]=z+1;
			   }
			   for(int value:x)
			   {
				   System.out.println(value);
			   }
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Can't divide by zero");
		  }
		  catch(ArrayIndexOutOfBoundsException e)
		  {
			  System.out.println("Max no.of value is 5");
		  }
		  System.out.println(c);
		  
		  
	  }

}
