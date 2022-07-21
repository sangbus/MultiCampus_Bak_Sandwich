package day13;
import java.io.*;
public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException{
		String fileName="c:/Users/park/git/sang/Begin/myicon.PNG";
		String fileName2="c:/myjava/copy.PNG";
		FileInputStream fis = new FileInputStream(fileName);
		FileOutputStream fos = new FileOutputStream(fileName2);
		int n=0;
		int cnt=0;
		byte[] arr = new byte[4000];
		while((n=fis.read(arr))!=-1)
		{
			//System.out.write(arr,0,n);
			//System.out.flush();
			fos.write(arr,0,n);
			fos.flush();
			cnt+=n;
		}
		System.out.println("총 파일 크기 : "+cnt+"bytes");
		System.out.println(fileName2+"에 카피 완료 !");
		fis.close();
		fos.close();
		System.out.close();
	}

}
