package testFile;

import java.io.File;
import java.io.IOException;

public class FileCreate {
	public static void main(String[] args)
	{
		try{
			File file = new File("E:/java_file_test/3.txt");
			if(file.createNewFile())
				System.out.println("�ļ������ɹ���");
			else
				System.out.println("�����ˣ����ļ��Ѿ����ڣ�");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
