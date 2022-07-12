package day06;
import java.io.*;

public class exception2 {
	public static void input()
	{
		try
		{
			char n = (char)System.in.read();
			//int n = System.in.read();
			System.out.println("n:"+n);
		}
		catch(IOException e)
		{
			System.out.println("입출력 에러 발생 : "+e);
		}
	}
	public static void sub() throws IOException
	{
		int n = System.in.read();
		System.out.println("n:"+n);
	}
	public static void main(String[] args) throws IOException {
		System.out.println("입력하세요");
		//exception2.input();
		exception2.sub();
	}
}
