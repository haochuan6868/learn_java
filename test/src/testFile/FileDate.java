package testFile;

import java.io.File;
import java.util.Date;

public class FileDate {
	public static void main(String[] args)
	{
		File file = new File("E:/java_file_test/1.txt");
		long lastModified = file.lastModified();
		System.out.println(lastModified);
		Date date = new Date(lastModified);
		System.out.println(date);
	}
}
