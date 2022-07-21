package day13;
import java.io.*;
public class InputStreamTest3 {

	public static void main(String[] args) throws IOException 
	{
		int n=0;
		int cnt=0;
		System.out.println("입력하세요 =>");
		byte[] arr = new byte[6];
		int total=0;
		while((n=System.in.read(arr)) != -1)
		{
			System.out.write(arr,0,n);
			System.out.flush();	//스트림에 남아있는 데이터를 밀어내기
			cnt++;	//반복문 횟수
			total+=n;	//입력받은 바이트 수
		}
		System.out.println(total+"bytes 읽음");
		System.in.close();
		System.out.close();
	}

}
