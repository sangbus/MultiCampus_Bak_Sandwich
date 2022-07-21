package day13;
import java.io.*;
public class FileReaderTest {

	public static void main(String[] args) throws IOException{
		//String fname = "C:\\Users\\park\\git\\sang\\Begin\\src\\day13\\FileInputStreamTest.java";
		String fname="C:\\Users\\park\\git\\sang\\Begin\\src\\day13\\FileInputStreamTest.java";
		File file = new File(fname);
		File file2 = new File("C:/myjava/readme_copy.txt");
		long fsize = file.length();
		System.out.println("파일의 크기 : "+fsize+"bytes");
		FileReader fr = new FileReader(file);
		FileWriter fw = new FileWriter(file2,true);
		
		int n=0;
		char[] data = new char[1000];
		while((n=fr.read(data))!=-1)
		{
			fw.write(data,0,n);
			fw.flush();
			//System.out.write(n);
			//System.out.flush();
		}
		fr.close();
	}

}
