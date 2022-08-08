package MultiThreading;

class Msg1 implements Runnable, java.lang.Runnable
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
class Msg2 implements Runnable, java.lang.Runnable
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

public class ThreadDemo2 
{
	public static void main (String[]args)
	{
		Msg1 R1=new Msg1();
		Msg2 R2=new Msg2();
		
		Thread t1=new Thread(R1);
		Thread t2=new Thread(R2);
		
		t1.start();
		
		try 
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
		
		}
		t2.start();
		
		
	}

}
