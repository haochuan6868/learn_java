package testFile;

import java.io.File;
import java.io.IOException;

public class FileCreate {
	public static void main(String[] args)
	{
		try{
			File file = new File("E:/java_file_test/3.txt");
			if(file.createNewFile())
				System.out.println("文件创建成功！");
			else
				System.out.println("出错了，该文件已经存在！");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
