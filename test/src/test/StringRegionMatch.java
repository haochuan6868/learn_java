package test;

public class StringRegionMatch {
	public static void main(String[] args)
	{
		String first_str = "Welcome to Microsoft";
		String second_str = "I word with microsoft";
		boolean match1 = first_str.regionMatches(11, second_str, 12, 9);
		boolean match2 = first_str.regionMatches(true, 11, second_str, 12, 9);
		System.out.println("区分大小写返回值:" + match1);
		System.out.println("不区分大小写返回值:" + match2);
	}
}
