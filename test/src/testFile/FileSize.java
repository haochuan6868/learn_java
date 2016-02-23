package testFile;

import java.io.File;

public class FileSize {
	public static long getFileSize(String filename)
	{
		File file = new File(filename);
		if(!file.exists() || !file.isFile()){
			System.out.println("文件不存在");
			return -1;
		}
		return file.length();
	}
	public static void main(String[] args)
	{
		long size = getFileSize("E:/java_file_test/1.txt");
		System.out.println("文件大小为:" + size);
	}
}
