package day06;
import java.io.*;
public class fileIO {

	public static void main(String[] args) {
		if(args.length!=1)
		{
			System.out.println("명령줄 인수로 읽을 파일명을 입력하세요 !");
			System.out.println("C:\\myjava\\day01\\Hello.java");
			return;
		}
		String fileName=args[0];
		System.out.println("읽을 파밀명 : "+fileName);
		String contents = fileIO.reading(fileName);
		System.out.println(contents);
	}

	
	/** 파일을 읽어서 파일내용을 문자열로 반환하는 메소드 
	 * */
	public static String reading(String fname)
	{
		FileReader fr = null;
		char[] data = new char[1000];
		try {
			fr=new FileReader(fname);	//파일과 노드 연결, FileNotFoundException 발생
			fr.read(data,0,1000);		//IOException
			fr.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("파일을 찾을 수 없어요");
		}
		catch(IOException e)
		{
			System.out.println("파일을 읽을 수 없어요");
		}
		String contents = new String(data);
		return contents;
	}
}
