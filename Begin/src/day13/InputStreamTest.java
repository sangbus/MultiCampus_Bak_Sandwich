package day13;
import java.io.IOException;
public class InputStreamTest {

	public static void main(String[] args) {
		int input=0;
		int count=0;
		System.out.println("입력하세요=>");
		try 
		{
			while(true)
			{
				input=System.in.read();
				System.out.println("input : " + input);
				count++;
				if(input=='x') break;
			}
			System.out.println("총 "+count+"바이트 입력받음");
		}
		catch(IOException e)
		{
		}
	}

}
