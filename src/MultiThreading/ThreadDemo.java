package MultiThreading;

class Message1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("Welcome");
			try 
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			
			}
		}
		
		
		
	}
	
}
class Message2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("Good Morning");
			try 
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			
			}
		}
		
		
	}
	
}

public class ThreadDemo 
{
	public static void main (String[]args)
	{
		Message1 M1=new Message1();
		Message2 M2=new Message2();
		
		M1.start();
		M2.start();
		try 
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
		
		}
		
		
		
	}

}
