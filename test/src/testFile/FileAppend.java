package testFile;

import java.io.*;

public class FileAppend {
	public static void main(String[] args) throws Exception {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("E:/java_file_test/1.txt"));
			out.write("aString1\n");
			out.close();
			out = new BufferedWriter(new FileWriter("E:/java_file_test/1.txt",true));
			out.write("aString2");
			out.close();
			BufferedReader in = new BufferedReader(new FileReader("E:/java_file_test/1.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			in.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
