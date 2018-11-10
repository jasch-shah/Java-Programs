/*
using clone() to call on any object ,JVM creates new object and copies all contents of previous object into it.
This doesn't invokes any constructor

*/

public class CloneExample implements Cloneable{
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	String name = "The End is Near";
	public static void main(String[] args) {
		CloneExample ob1 = new CloneExample();
		try{
			CloneExample ob2 = (CloneExample)ob1.clone();
			System.out.println(ob2.name);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		System.out.println(ob1.name);
	}
}