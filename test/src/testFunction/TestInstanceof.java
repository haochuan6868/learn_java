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
			System.out.println("������ java.util.Vector ���ʵ��");
		else if(o instanceof ArrayList)
			System.out.println("������ java.util.ArrayList ���ʵ��");
		else
			System.out.println("������ " + o.getClass() + "���ʵ��");
	}
}
