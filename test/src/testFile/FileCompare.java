package testFile;

import java.io.File;

public class FileCompare {
	public static void main(String[] args)
	{
		File file1 = new File("E:/java_file_test/1.txt");
		File file2 = new File("E:/java_file_test/2.txt");
		if(file1.compareTo(file2) == 0){
			System.out.println("�ļ�·��һ�£�");
		} else {
			System.out.println("�ļ�·����һ�£�");
		}
	}
}
