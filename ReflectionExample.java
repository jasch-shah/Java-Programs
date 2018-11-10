import java.util.*;
import java.io.*;

public class ReflectionExample
{
	private String name;
	ReflectionExample(){

	}
	public void setName(String name){
		this.name = name;
	}

	public static void main(String[] args) {
		try{
			Constructor<ReflectionExample> constructor = ReflectionExample.class.getDeclaredConstructor();
			ReflectionExample r = constructor.newInstance();
			r.setName("The End is Near!!");
			System.out.println(r.name);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}