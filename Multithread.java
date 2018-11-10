import java.io.*;
import java.util.*;

class MultithreadDemo extends Thread
{
	public void run()
	{
		try{
			System.out.println("Thread "+Thread.currentThread().getId()+
				" is running");
		}
		catch(Exception e)
		{
			System.out.println("Exception!!");
		}
	}
}

public class Multithread
{
	public static void main(String[] args) {
		int n = 8;
		for(int i=0;i<8;i++)
		{
			MultithreadDemo obj = new MultithreadDemo();
			obj.start();
		}
	}
}