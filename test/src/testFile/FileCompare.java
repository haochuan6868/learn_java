package testFile;

import java.io.File;

public class FileCompare {
	public static void main(String[] args)
	{
		File file1 = new File("E:/java_file_test/1.txt");
		File file2 = new File("E:/java_file_test/2.txt");
		if(file1.compareTo(file2) == 0){
			System.out.println("文件路径一致！");
		} else {
			System.out.println("文件路径不一致！");
		}
	}
}
