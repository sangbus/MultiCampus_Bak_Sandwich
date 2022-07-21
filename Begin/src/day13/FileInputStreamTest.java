package day13;
import java.io.*;
public class FileInputStreamTest {

	public static void main(String[] args) throws IOException{
		String fileName="src/day13/InputStreamTest.java";
		FileInputStream fis = new FileInputStream(fileName);
		int n=0;
		int cnt=0;
		while((n=fis.read())!=-1)
		{
			System.out.write(n);
			System.out.flush();
			cnt++;
		}
		System.out.println("총 파일 크기 : "+cnt+"bytes");
		fis.close();
		System.out.close();
	}

}
