package day13;
import java.io.*;
public class InputStreamTest2 {

	public static void main(String[] args) throws IOException 
	{
		int n=0;
		int cnt=0;
		System.out.println("입력하세요 =>");
		while((n=System.in.read()) != -1)
		{
			System.out.println("n : "+((char)n));
			cnt++;
		}
		System.out.println(cnt+"bytes 읽음");
		System.in.close();
		System.out.close();
	}

}
