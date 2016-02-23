package testFile;

import java.io.File;

public class FileDir {
	public static void main(String[] args)
	throws Exception {
		File file = null;
		File dir = new File("E:/java_file_test/");
		file = File.createTempFile("JavaTemp", ".javatemp", dir);
		System.out.println(file.getPath());
	}
}
