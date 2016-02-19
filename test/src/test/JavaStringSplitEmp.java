package test;

public class JavaStringSplitEmp {
	public static void main(String args[])
	{
		String str = "www.zhengdingzx.com";
		String[] temp;
		String delimeter = "\\.";	// . 需要转义
		temp = str.split(delimeter);
		for(int i = 0; i < temp.length; i++){
			System.out.println(temp[i]);
			System.out.println("");
		}
	}
}
