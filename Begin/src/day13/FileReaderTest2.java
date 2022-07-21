package day13;
import java.io.*;
public class FileReaderTest2 {

	public static void main(String[] args) throws IOException{
		//String fname = "C:\\Users\\park\\git\\sang\\Begin\\src\\day13\\FileInputStreamTest.java";
		String fname="C:/myjava/readme.txt";
		File file = new File(fname);
		long fsize = file.length();
		System.out.println("파일의 크기 : "+fsize+"bytes");
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader fr = new InputStreamReader(fis,"EUC-KR");
		OutputStreamWriter ow = new OutputStreamWriter(System.out,"UTF-8");
		int n=0;
		while((n=fr.read())!=-1)
		{
			ow.write(n);
			ow.flush();
			//System.out.write(n);
			//System.out.flush();
		}
		fr.close();
	}

}
