package testFunction;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Date;

public class TestInstanceof {
	public static void main(String[] args)
	{
		Object testObject = new Date();
		displayObjectClass(testObject);
	}
	public static void displayObjectClass(Object o)
	{
		if (o instanceof Vector)
			System.out.println("对象是 java.util.Vector 类的实例");
		else if(o instanceof ArrayList)
			System.out.println("对象是 java.util.ArrayList 类的实例");
		else
			System.out.println("对象是 " + o.getClass() + "类的实例");
	}
}
