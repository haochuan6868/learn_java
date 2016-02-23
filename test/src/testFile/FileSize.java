package testFile;

import java.io.File;

public class FileSize {
	public static long getFileSize(String filename)
	{
		File file = new File(filename);
		if(!file.exists() || !file.isFile()){
			System.out.println("�ļ�������");
			return -1;
		}
		return file.length();
	}
	public static void main(String[] args)
	{
		long size = getFileSize("E:/java_file_test/1.txt");
		System.out.println("�ļ���СΪ:" + size);
	}
}
