/*
Whenever we serialize and then deserialize an object , JVM creates seperate object .

In deserialization ,JVM doesn't use any constructor to create object

Implement Serializable interface.

*/

import java.io.*;

class DeserializationExample implements Serializable
{
	private String name;
	DeserializationExample(String name)
	{
		this.name = name;

	}

	public static void main(String[] args) {
		try{
			DeserializationExample d = new DeserializationExample("Thanos is Coming !!!");
			FileOutputStream f = new FileOutputStream("thanos.txt");
			ObjectOutputStream oos = new ObjectOutputStream(f);
			oos.writeObject(d);
			oos.close();
			f.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}